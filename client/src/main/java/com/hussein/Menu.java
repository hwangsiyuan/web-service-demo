package com.hussein;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Objects;

/**
 * <p>Title: Menu</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2020/4/23 11:55 AM
 */
@Data
public class Menu {

    @JsonIgnore
    private String cn1;

    @JsonIgnore
    private String cn2;

    @JsonIgnore
    private String cn3;

    @JsonIgnore
    private String en1;

    @JsonIgnore
    private String en2;

    @JsonIgnore
    private String en3;

    @JsonIgnore
    private int order;

    public String getParentName() {
        return en2.endsWith(".md") ? cn1 : en3 == null ? cn1 : cn2;
    }

    public String getFullPath() {
        String fullPath = "/pages/" + en1 + "/" + en2 + (en3 == null ? "" : "/" + en3);
        return fullPath.endsWith(".md") ? fullPath : "";
    }

    public String getName() {
        return en3 == null ? cn2 : cn3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(cn1, menu.cn1) &&
                Objects.equals(cn2, menu.cn2) &&
                Objects.equals(cn3, menu.cn3) &&
                Objects.equals(en1, menu.en1) &&
                Objects.equals(en2, menu.en2) &&
                Objects.equals(en3, menu.en3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cn1, cn2, cn3, en1, en2, en3);
    }
}
