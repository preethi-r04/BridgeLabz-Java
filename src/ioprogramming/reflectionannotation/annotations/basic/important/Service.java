package ioprogramming.reflectionannotation.annotations.basic.important;
public class Service {

    @ImportantMethod
    public void process() {}

    @ImportantMethod(level = "LOW")
    public void helper() {}

    public void normal() {}
}
