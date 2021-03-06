package pattern;

public class Dell extends Device{
    private String ram;
    private String processor;
    private  String gpu;
    public Dell(String ramSize, String processorType, String gpuType){
        this.ram=ramSize;
        this.processor=processorType;
        this.gpu=gpuType;
    }
    @Override
    public String getDetails(){
        return "Dell config is ram size:" + this.ram+ "and processor type is "+ this.processor+" and the gpu is "+ this.gpu;
    }
    @Override
    public String toString() {
        return "Dell{ " + "Ram " + ram + " processor" + processor + " }";
    }
}
