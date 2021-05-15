package com.djalmajunior.bookstoremanager.author.builder;

import com.djalmajunior.bookstoremanager.author.dto.AuthorDTO;
import lombok.Builder;

@Builder
public class AuthorDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Djalma Junior";

    @Builder.Default
    private final int age = 28;

    public AuthorDTO buildAuthorDTO() {
        return new AuthorDTO(id, name, age);
    }
}
