package design_patterns.builder;

public class Phone {
    private String frontPanel;
    private String backPanel;
    private String processor;

    public String getFrontPanel() {
        return frontPanel;
    }

    public void setFrontPanel(String frontPanel) {
        this.frontPanel = frontPanel;
    }

    public String getBackPanel() {
        return backPanel;
    }

    public void setBackPanel(String backPanel) {
        this.backPanel = backPanel;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
