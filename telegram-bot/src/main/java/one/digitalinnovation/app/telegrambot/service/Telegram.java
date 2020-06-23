package one.digitalinnovation.app.telegrambot.service;

import one.digitalinnovation.app.telegrambot.client.FeingClient;
import one.digitalinnovation.app.telegrambot.client.JavaHttpClient;
import one.digitalinnovation.app.telegrambot.client.RestTemplateClient;
import one.digitalinnovation.app.telegrambot.dto.MessageSend;
import one.digitalinnovation.app.telegrambot.dto.ResultBotTelegram;
import one.digitalinnovation.app.telegrambot.dto.ResultBotTelegramList;
import org.springframework.stereotype.Service;

@Service
public class Telegram {
    private RestTemplateClient restTemplateClient;
    private FeingClient feingClient;
    private JavaHttpClient javaHttpClient;

    public Telegram(RestTemplateClient restTemplateClient, FeingClient feingClient, JavaHttpClient javaHttpClient) {
        this.restTemplateClient = restTemplateClient;
        this.feingClient = feingClient;
        this.javaHttpClient = javaHttpClient;
    }

    public void enviarMensagem(MessageSend mensagem) {
        //HTTP CLIENT
        ResultBotTelegram resultBotTelegramResponseEntity = javaHttpClient.enviarMensagem(mensagem);

        //RestTemplate
        restTemplateClient.enviarMensagem(mensagem);

        //FeingClient
        ResultBotTelegram resultBotTelegram = feingClient.enviarMensagem1(mensagem);
    }

    public ResultBotTelegramList buscarAtualizacao() {
        //HTTP CLIENT
        ResultBotTelegramList resultBotTelegramList = javaHttpClient.buscarAtualizacao();

        //RestTemplate
        ResultBotTelegramList resultBotTelegramList1 = restTemplateClient.buscarAtualizacao();

        //FeingClient
        feingClient.buscaratualizacao();
        return resultBotTelegramList;
    }
}
