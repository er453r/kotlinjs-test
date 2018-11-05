@View("testone")
class TestComponent : Component() {
    init {
        println("TestComponent created")

        element.innerHTML = "this is so derp"
    }
}
