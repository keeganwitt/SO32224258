trait AbstractSender {
    abstract SentTrigger sendMail(Mail main)

    SentTrigger sentTrigger(Mail mail) { }
}
