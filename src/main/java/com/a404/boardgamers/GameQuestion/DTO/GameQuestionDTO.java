package com.a404.boardgamers.GameQuestion.DTO;

import com.a404.boardgamers.GameQuestion.Domain.Entity.GameQuestion;
import com.a404.boardgamers.GameQuestion.Domain.Entity.GameQuestionAnswer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GameQuestionDTO {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class getGameQuestionDTO {
        GameQuestion gameQuestion;
        GameQuestionAnswer gameQuestionAnswer;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class uploadGameQuestionDTO {
        String title;
        String content;
        Integer gameId;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class uploadGameQuestionAnswerDTO {
        String content;
    }
}