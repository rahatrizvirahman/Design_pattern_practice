## Some Key Points
- Observer design pattern has two roles subject(observable) and observer
- Observers subscribes to the subject
- If the state in subject changes it notifies the observers
    - The obserservers has update method which is used by the subject to notify
    - In the update method the observers can use the related subject's getState() to get the updated state