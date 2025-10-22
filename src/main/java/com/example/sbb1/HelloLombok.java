package com.example.sbb1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloLombok {
    private final String name;
    private final int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);
    }
}
