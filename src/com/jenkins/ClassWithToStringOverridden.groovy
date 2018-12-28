package com.jenkins

class ClassWithToStringOverridden {

    ClassWithToStringOverridden(){
    }

    @Override
    String toString() {
        return "custom_class"
    }
}
