@Library("sharedlib@to-string")
import com.jenkins.ToStringClass

println("1")
println(new ToStringClass())

println("2")
println("prefix: " + new ToStringClass())

println("3")
println("prefix: " + new ToStringClass().toString())
