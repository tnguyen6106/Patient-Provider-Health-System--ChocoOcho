public class Provider extends Node {

    protected Address p_address;//TODO Implement
    protected String Name;
    protected int id;
    protected service_list offers//TODO
    service_history p_history//TODO
    protected int week_fee;
    protected int num_consultations;

    public Provider() {
        this.Name = null;
        this.id = 0;
        this.week_fee = 0;
        this.num_consultations = 0;
    }
    public void generateServiceReport(){}//TODO Implement
    public boolean generateServiceList(){};//Generates text file.
    public String verifyService(){}
    public String validateMember(){}
    public void get_history(){};//Return service history?
    public void get_address(){};
    public float get_week_fee(){};
    public int get_num_consultations(){};
}
// }