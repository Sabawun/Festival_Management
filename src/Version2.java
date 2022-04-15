public class Version2 extends VersionManagement{
    @Override
    public void assemble() {
        super.assemble();
        for (int i = 0 ; i < FestivalList.getInstance().getFestival().size();i++) {
            for (int j = 0; j < FestivalList.getInstance().getFestival().get(i).getFestival_Run().size(); j++) {
                for (int k = 0; k < FestivalList.getInstance().getFestival().get(i).getFestival_Run().get(j).getEvents().size(); k++)
                    System.out.println(FestivalList.getInstance().getFestival().get(i).getFestival_Run().get(j).getEvents().get(k).getDate());
            }
        }
    }

    public Version2(Version v) {
        super(v);
    }
}
