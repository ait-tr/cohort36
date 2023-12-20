package classwork.last_homework.task1;

import java.util.Objects;

public class Mouse {
    private String model;
    private String caseColor;
    private boolean hasRgb;
    private boolean wired;
    private int buttons;
    private int dpi;

    public Mouse(String model, String caseColor, boolean hasRgb, boolean wired, int buttons, int dpi) {
        this.model = model;
        this.caseColor = caseColor;
        this.hasRgb = hasRgb;
        this.wired = wired;
        this.buttons = buttons;
        this.dpi = dpi;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public boolean isWired() {
        return wired;
    }

    public void setWired(boolean wired) {
        this.wired = wired;
    }

    public boolean hasRgb() {
        return hasRgb;
    }

    public void setHasRgb(boolean hasRgb) {
        this.hasRgb = hasRgb;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, caseColor, hasRgb, wired, buttons, dpi);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Mouse) {
            Mouse mouse = (Mouse) o;

            return this.model.equals(mouse.model)
                    && this.caseColor.equals(mouse.caseColor)
                    && this.hasRgb == mouse.hasRgb
                    && this.wired == mouse.wired
                    && this.buttons == mouse.buttons
                    && this.dpi == mouse.dpi;
        }
        return false;
    }
}
