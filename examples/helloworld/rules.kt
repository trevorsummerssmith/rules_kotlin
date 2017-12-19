package examples.helloworld

data class KotlinLibraryRule(
	val name: String,
	val jars: List<String> = listOf<String>(),
	val deps: List<String> = listOf<String>()
)

data class KotlinBinaryRule(
	val name: Foo,
	val jars: List<String> = listOf<String>(),
	val deps: List<String> = listOf<String>()
) {
	constructor (name:String) : this(Foo(name))
}
