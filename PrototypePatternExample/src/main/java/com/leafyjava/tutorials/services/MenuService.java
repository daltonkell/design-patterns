package com.leafyjava.tutorials.services;

import com.leafyjava.tutorials.domains.AbstractMenuItem;
import com.leafyjava.tutorials.utils.enums.MenuItemType;

import java.util.Map;

public interface MenuService {
    Map<MenuItemType, AbstractMenuItem> loadMenu();
}
