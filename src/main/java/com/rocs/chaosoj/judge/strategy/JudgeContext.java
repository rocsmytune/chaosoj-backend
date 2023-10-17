package com.rocs.chaosoj.judge.strategy;

import com.rocs.chaosoj.model.dto.question.JudgeCase;
import com.rocs.chaosoj.judge.codesandbox.model.JudgeInfo;
import com.rocs.chaosoj.model.entity.Question;
import com.rocs.chaosoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
