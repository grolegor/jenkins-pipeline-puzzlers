@Library("sharedlib")
import com.jenkins.ClassWithToStringOverridden

println("1")
println(new ClassWithToStringOverridden())

println("2")
println("prefix: " + new ClassWithToStringOverridden())

println("3")
println("prefix: " + new ClassWithToStringOverridden().toString())
