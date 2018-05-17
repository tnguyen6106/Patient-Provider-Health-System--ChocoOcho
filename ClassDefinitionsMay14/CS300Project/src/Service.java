public class Service extends Node {
    protected String s_name;
    protected int s_code;
    protected float s_fee;

    public Service(String service, int code, float fee)
    {
        this.s_name = service;
        this.s_code = code;
        this.s_fee = fee;
    }

    public String get_service_name()
    {
        return this.s_name;
    }

    public int get_service_code()
    {
        return this.s_code;
    }

    public float get_service_fee()
    {
        return this.s_fee;
    }

    public void DisplayAll()
    {
        System.out.println(this.s_name + " " + this.s_code + " " + this.s_fee);
    }


}
