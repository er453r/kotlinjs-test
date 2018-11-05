import org.w3c.dom.HTMLElement
import kotlin.browser.document

abstract class Component {
    val element:HTMLElement

    init {
        @Suppress("LeakingThis")
        
        println("Component ${this::class.simpleName}")



        val html = "<h1>DEFAULT</h1>"

        println("Component created with utils.getView $html")

        val tempDiv = document.createElement("div")
        tempDiv.innerHTML = html

        element = tempDiv.firstElementChild!! as HTMLElement
    }
}

annotation class View(val name: String)
