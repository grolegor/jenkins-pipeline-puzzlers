package com.grol.jenkins

class CustomClass {

    String property

    CustomClass(String property){
        this.property = property
    }

    @Override
    String toString() {
        return property.toString()
    }

    @Override
    boolean equals(Object obj) {
        return obj instanceof CustomClass ? this.property == obj.property: false
    }

    @Override
    int hashCode() {
        return toString().hashCode()
    }
}
