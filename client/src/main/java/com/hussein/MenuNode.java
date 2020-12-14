package com.hussein;

import lombok.Data;

import java.util.List;

/**
 * <p>Title: MenuNode</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2020/4/23 12:37 PM
 */
@Data
public class MenuNode {

    private String title;

    private String path;

    private Boolean collapsable;

    private Integer sidebarDepth;

    private List<MenuNode> children;

}
