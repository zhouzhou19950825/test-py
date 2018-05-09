package com.upic;

import org.python.util.PythonInterpreter;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestJavaPyApplication {
	public static void main(String[] args) {
//		SpringApplication.run(TestJavaPyApplication.class, args);
		PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("print(1/0)");
//		interpreter.execfile("hero.py");
	}
}
