
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbTitle {

    private String cssClasses;
    private Boolean hidden = false;
    private String text = "Title";
    private PbTitle.Level level = PbTitle.Level.fromValue("Level 2");
    private PbTitle.Alignment alignment = PbTitle.Alignment.fromValue("left");

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
     *     The level
     */
    public PbTitle.Level getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(PbTitle.Level level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The alignment
     */
    public PbTitle.Alignment getAlignment() {
        return alignment;
    }

    /**
     * 
     * @param alignment
     *     The alignment
     */
    public void setAlignment(PbTitle.Alignment alignment) {
        this.alignment = alignment;
    }

    public enum Alignment {

        LEFT("left"),
        CENTER("center"),
        RIGHT("right");
        private final String value;
        private final static Map<String, PbTitle.Alignment> CONSTANTS = new HashMap<String, PbTitle.Alignment>();

        static {
            for (PbTitle.Alignment c: values()) {
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

        public static PbTitle.Alignment fromValue(String value) {
            PbTitle.Alignment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Level {

        LEVEL_1("Level 1"),
        LEVEL_2("Level 2"),
        LEVEL_3("Level 3"),
        LEVEL_4("Level 4"),
        LEVEL_5("Level 5"),
        LEVEL_6("Level 6");
        private final String value;
        private final static Map<String, PbTitle.Level> CONSTANTS = new HashMap<String, PbTitle.Level>();

        static {
            for (PbTitle.Level c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Level(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbTitle.Level fromValue(String value) {
            PbTitle.Level constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
