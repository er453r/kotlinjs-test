import org.w3c.dom.HTMLHeadingElement
import utils.appendChild
import kotlin.browser.document

fun main(args: Array<String>) {
    println("hello derp!")

    val testComponent = TestComponent()
    val testComponentTwo = TestComponentTwo()

    val header = document.createElement("h1") as HTMLHeadingElement

    header.innerHTML = "H1"

    val header2 = document.createElement("h1") as HTMLHeadingElement

    header2.innerHTML = TestUtils().sayHello("DERP")

    document.addEventListener("DOMContentLoaded", {
        document.body?.let {
            it.appendChild(header)
            it.appendChild(header2)
            it.appendChild(testComponent)
        }
    })
}
