package utils

import Component
import TestComponent
import org.w3c.dom.HTMLElement

fun TestComponent(): TestComponent{
    println("TestComponent factory")

    return TestComponent("<h3>Ittie bittie h3</h3>")
}

fun HTMLElement.appendChild(component: Component){
    this.appendChild(component.element)
}
