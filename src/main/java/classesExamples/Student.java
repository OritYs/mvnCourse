package classesExamples;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    @Getter
    @Setter
    private String firstName;
    private String lastName;
    private String email;
}
