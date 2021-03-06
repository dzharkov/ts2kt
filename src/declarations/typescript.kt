package typescript

@native
val ts: dynamic

@native
fun TS.hasFlag<E : Enum<E>>(flags: Enum<E>, flag: E): Boolean = noImpl

@native
fun TS.unescapeIdentifier(identifier: String): String = noImpl
