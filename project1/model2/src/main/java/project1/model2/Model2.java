package project1.model2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project1.model1.Code;

/**
 * Created by hongpf on 16/5/5.
 */
public class Model2 {
    Logger  logger = LoggerFactory.getLogger(Model2.class) ;
    public  static String  hello(){
         Code.hello();
        return  "project:model2";
    }
}