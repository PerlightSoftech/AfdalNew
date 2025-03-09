package com.example.afdalWar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageConttroller {

    @RequestMapping("/")
    public String MainCall() {
        return "index";
    }


    @RequestMapping("/about")
    public String AboutCall() {
        return "about";
    }

    @RequestMapping("/accountandbook")
    public String AccountandBookCall() {
        return "accountandbook";
    }


    @RequestMapping("/blog")
    public String BlogCall() {
        return "blog";
    }

    @RequestMapping("/contact_us")
    public String contact_usCall() {
        return "contact_us";
    }

    @RequestMapping("/corporate")
    public String corporateCall() {
        return "corporate";
    }

    @RequestMapping("/faq")
    public String faqCall() {
        return "faq";
    }

    @RequestMapping("/freezone")
    public String FreezoneCall() {
        return "freezone";
    }

    @RequestMapping("/mainland")
    public String MainlandCall() {
        return "mainland";
    }

    @RequestMapping("/privacyandpolicy")
    public String PrivacyAndPolicyCall() {
        return "privacyandpolicy";
    }

    @RequestMapping("/teams")
    public String TeamsCall() {
        return "teams";
    }

    @RequestMapping("/termsandcondition")
    public String TermsandConditionCall() {
        return "termsandcondition";
    }

    @RequestMapping("/vatandtax")
    public String VatandTaxCall() {
        return "vatandtax";
    }


}
