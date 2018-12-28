@Library("sharedlib@to-string")
import com.jenkins.CustomClass

println("1")
println(new CustomClass())

println("2")
println("prefix: " + new CustomClass())

println("3")
println("prefix: " + new CustomClass().toString())
