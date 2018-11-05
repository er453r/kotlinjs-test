package utils

import Component
import TestComponent
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement

val TestComponent.header:Element
    get() = this.element.querySelector("h3")!!

fun HTMLElement.appendChild(component: Component){
    this.appendChild(component.element)
}

