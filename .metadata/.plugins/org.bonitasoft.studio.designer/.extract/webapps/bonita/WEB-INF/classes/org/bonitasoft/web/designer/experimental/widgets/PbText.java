
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbText {

    private String cssClasses;
    private Boolean hidden = false;
    private Boolean labelHidden = true;
    private String label = "Default label";
    private PbText.LabelPosition labelPosition = PbText.LabelPosition.fromValue("top");
    private Double labelWidth = 4.0D;
    private Boolean allowHTML = true;
    private String text = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet,<br/>consectetur,<br/>adipisci velit...";
    private PbText.Alignment alignment = PbText.Alignment.fromValue("left");

    /**
     * 
     * @return
     *     The cssClasses
     */
    public String getCssClasses() {
        return cssClasses;
    }

    /**
     * 
     * @param cssClasses
     *     The cssClasses
     */
    public void setCssClasses(String cssClasses) {
        this.cssClasses = cssClasses;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The labelHidden
     */
    public Boolean getLabelHidden() {
        return labelHidden;
    }

    /**
     * 
     * @param labelHidden
     *     The labelHidden
     */
    public void setLabelHidden(Boolean labelHidden) {
        this.labelHidden = labelHidden;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The labelPosition
     */
    public PbText.LabelPosition getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition
     *     The labelPosition
     */
    public void setLabelPosition(PbText.LabelPosition labelPosition) {
        this.labelPosition = labelPosition;
    }

    /**
     * 
     * @return
     *     The labelWidth
     */
    public Double getLabelWidth() {
        return labelWidth;
    }

    /**
     * 
     * @param labelWidth
     *     The labelWidth
     */
    public void setLabelWidth(Double labelWidth) {
        this.labelWidth = labelWidth;
    }

    /**
     * 
     * @return
     *     The allowHTML
     */
    public Boolean getAllowHTML() {
        return allowHTML;
    }

    /**
     * 
     * @param allowHTML
     *     The allowHTML
     */
    public void setAllowHTML(Boolean allowHTML) {
        this.allowHTML = allowHTML;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The alignment
     */
    public PbText.Alignment getAlignment() {
        return alignment;
    }

    /**
     * 
     * @param alignment
     *     The alignment
     */
    public void setAlignment(PbText.Alignment alignment) {
        this.alignment = alignment;
    }

    public enum Alignment {

        LEFT("left"),
        CENTER("center"),
        RIGHT("right");
        private final String value;
        private final static Map<String, PbText.Alignment> CONSTANTS = new HashMap<String, PbText.Alignment>();

        static {
            for (PbText.Alignment c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Alignment(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbText.Alignment fromValue(String value) {
            PbText.Alignment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum LabelPosition {

        LEFT("left"),
        TOP("top");
        private final String value;
        private final static Map<String, PbText.LabelPosition> CONSTANTS = new HashMap<String, PbText.LabelPosition>();

        static {
            for (PbText.LabelPosition c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private LabelPosition(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbText.LabelPosition fromValue(String value) {
            PbText.LabelPosition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
