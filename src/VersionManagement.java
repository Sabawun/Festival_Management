public class VersionManagement implements Version{
    protected Version version;

    public VersionManagement(Version v){
            this.version = v;
    }

    @Override
    public void assemble() {
        this.version.assemble();
    }
}
