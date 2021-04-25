package com.tyust.controller;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author ysj
 * @create 2021-02-04 {TIME}
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        Locale l = null;
        String locale = httpServletRequest.getParameter("locale");

        if (locale!=null && !"".equals(locale)){
            l = new Locale(locale.split("_")[0],locale.split("_")[1]);
        }else {
            l = httpServletRequest.getLocale();
        }

        return l;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, @Nullable HttpServletResponse httpServletResponse, @Nullable Locale locale) {

    }
}
