package mustafaozhan.github.com.mycurrencies.function.lambda

inline fun <reified T> ensure(
    vararg elements: T?,
    closureSafe: () -> Unit
) =
    if (elements.all { it != null }) {
        closureSafe()
    } else {
        null
    }

inline fun <reified T> T?.inCase(block: () -> Unit): T? {
    if (this == null) block()
    return this
}