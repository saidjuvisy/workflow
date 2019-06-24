package fr.intm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ManageUser implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {


        delegateExecution.setVariable("isUser","user is created");

    }
}
