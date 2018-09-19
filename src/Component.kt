import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class Component(html:String) {
    val element:HTMLElement

    init {
        println("Component created with utils.getView $html")

        val tempDiv = document.createElement("div")
        tempDiv.innerHTML = html

        element = tempDiv.firstElementChild!! as HTMLElement
    }
}
