//
//  ObservableSEED.swift
//  ios
//
//  Created by Mustafa Ozhan on 25/01/2021.
//  Copyright © 2021 orgName. All rights reserved.
//

import Combine
import client

final class ObservableSEED<
    ViewModel: BaseSEEDViewModel,
    State: BaseState,
    Effect: BaseEffect,
    Event: BaseEvent,
    Data: BaseData
>: ObservableObject {

    let viewModel: ViewModel

    @Published private(set) var state: State

    let effect = PassthroughSubject<Effect, Never>()
    let event: Event

    let data: Data?

    // swiftlint:disable force_cast
    init(viewModel: ViewModel) {
        LoggerKt.kermit.d(withMessage: {"ObservableSEED \(ViewModel.description()) init"})

        self.viewModel = viewModel
        self.state = State()
        self.event = viewModel.event as! Event
        self.data = viewModel.data as? Data
    }

    deinit {
        self.viewModel.onCleared()
    }

    func startObserving() {
        if viewModel.state != nil {
            self.viewModel.observe(viewModel.state!, onChange: {
                self.state = $0 as! State
            })
        }
        if viewModel.effect != nil {
            self.viewModel.observe(viewModel.effect!, onChange: {
                self.effect.send($0 as! Effect)
            })
        }
    }
}
