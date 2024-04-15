import java.util.List;
import java.util.Map;

public class ReactNativeApp {
    private String appName;
    private List<Screen> screens;
    private Map<String, Component> components;

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setComponents(Map<String, Component> components) {
        this.components = components;
    }

    public Map<String, Component> getComponents() {
        return components;
    }
}

class Screen {
    private String name;
    private List<Component> components;

    // Constructors, getters, and setters
}

class Component {
    private String name;
    private String type;

    // Constructors, getters, and setters
}
