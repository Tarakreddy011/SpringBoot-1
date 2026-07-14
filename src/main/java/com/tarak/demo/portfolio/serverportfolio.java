package com.tarak.demo.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serverportfolio {

    @GetMapping("/portfolio")
    public String myself() {
        return """
                <h1>My Portfolio</h1>
                <p>Welcome to my personal page!</p>
                <h2>My name is Tarakeswar Reddy, I am currently pursuing my Btech in sce at lpu </h2>
                """;
    }

    @GetMapping("/portfolio/education")
    public String myEducation() {
        return """
                <h1>My Education</h1>
                <ul>
                    <li>10th Percentage — 98.8%</li>
                    <li>12th Percentage — 86.8%</li>
                    <li>B.Tech CGPA — 7.16</li>
                </ul>
                """;
    }

    @GetMapping("/portfolio/skills")
    public String mySkills() {
        return """
                <h1>My skills</h1>
                <ul>
                    <li>Java</li>
                    <li>Python</li>
                    <li>Ruby</li>
                    <li>Andriod</li>
                </ul>
                """;
    }
}
