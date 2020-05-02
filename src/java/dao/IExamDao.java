
package dao;

import java.util.List;
import models.QuestionPossibleAnswers;
import models.Result;
import models.User;
import models.UserAnswers;

/**
 *
 * @author Arara
 */
public interface IExamDao {
    // Get questions from databse
    List<QuestionPossibleAnswers> getQuestionsWithPossibleAnswers();
    
    // Save User to db
    boolean saveUser(User user);
    
    // Save selected answers to db from the user input
    boolean saveUserSelectedAnswers(UserAnswers userAnswers);
    
    // Get result from db
    Result getResult(User user);
}
