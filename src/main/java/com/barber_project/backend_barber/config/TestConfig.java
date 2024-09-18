package com.barber_project.backend_barber.config;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.barber_project.backend_barber.entities.Agendamento;
import com.barber_project.backend_barber.entities.Profissional;
import com.barber_project.backend_barber.entities.Servico;
import com.barber_project.backend_barber.entities.Usuario;
import com.barber_project.backend_barber.repositories.AgendamentoRepository;
import com.barber_project.backend_barber.repositories.ProfissionalRepository;
import com.barber_project.backend_barber.repositories.ServicoRepository;
import com.barber_project.backend_barber.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	public void run(String... args) throws Exception {

		Profissional prof1 = new Profissional(null, "Marcão Machadada", "Salve, salve, galera! Sou o Marcão Machadada, o único cabeleireiro que pode transformar uma juba de leão em um corte digno de um rei com um único movimento de tesoura.","", 5, 87);
		Profissional prof2 = new Profissional(null, "Beto Brutal", "Quando o assunto é barba, ninguém faz melhor que Beto Brutal! Suas lâminas afiadas são lendárias e seu estilo é inconfundível. Para um visual marcante e robusto, ele é o seu homem!","", 5, 87);
		Profissional prof3 = new Profissional(null, "Kathya Tesourada", "Kathya não tem medo de tesourar! Com precisão e ousadia, ela transforma qualquer cabelo em uma obra-prima rústica. Seu lema? Corte raiz sem perder a feminilidade!","", 5, 87);
		Profissional prof4 = new Profissional(null, "Sérgio Serrador", "Sérgio é conhecido por sua técnica impecável e estilo único. Com sua serra (ou melhor, tesoura) em mãos, ele cria visuais que impressionam. Barba bem-feita é com ele mesmo!","", 5, 87);
		Profissional prof5 = new Profissional(null, "Rafa Raspa Tudo", "Para aqueles que preferem um look mais rente, Rafa é o especialista! Sua máquina raspa tudo com precisão, deixando um acabamento perfeito. Raspar é a sua arte!","",5, 87);
		Profissional prof6 = new Profissional(null, "Fernanda Faísca", "Fernanda traz um toque de brilho e energia a cada corte. Com suas lâminas ágeis, ela faz milagres em qualquer tipo de cabelo. Precisa de um look cheio de faísca? É com ela mesmo!","", 5, 87);
		
		profissionalRepository.saveAll(Arrays.asList(prof1,prof2,prof3,prof4,prof5,prof6));

		Servico serv1 = new Servico(null, "Corte Viking", "Venha receber um corte de Viking, com lâmina na pele e estilo de guerreiro. Saia pronto para enfrentar qualquer batalha com um visual que impõe respeito.", 55, 3, "");
		Servico serv2 = new Servico(null, "Barba Lenhador", "Venha dar um trato na sua barba de lenhador, com aparo preciso e estilo de macho raiz. Saia com uma barba que impõe respeito e faz tremer até as árvores.", 45, 3, "");
		Servico serv3 = new Servico(null, "Garras Brutais", "Venha transformar suas patas de urso em garras de lobo. Nosso serviço de Manicure & Pedicure para homens é tão bruto quanto você, mas com um toque de classe.", 40, 3, "");
		Servico serv4 = new Servico(null, "Combo Alpha", "Nosso combo Alpha inclui um corte de cabelo de Viking, uma barba de lenhador e manicure & pedicure de gladiador. Saia pronto para enfrentar qualquer batalha com estilo e unhas afiadas.", 95, 3, "");
		Servico serv5 = new Servico(null, "Pequeno Caçador", "Transforme seu pequeno aventureiro em um mini caçador, com um corte cheio de atitude e estilo. Cabelo afiado como uma guitarra e maneiro como uma Harley.", 60, 3, "");
		Servico serv6 = new Servico(null, "Noivo Raiz", "Prepare-se para o grande dia com um tratamento digno de um verdadeiro guerreiro da estrada. Corte de cabelo afiado, barba de lenhador e manicure de motoqueiro, tudo enquanto você relaxa ao som de rock pesado.", 180, 3, "");
	
		servicoRepository.saveAll(Arrays.asList(serv1,serv2,serv3,serv4,serv5,serv6));
		
		Usuario user1 = new Usuario(null, "vanderson@teste.com", "Vanderson", "123456", "9645612");
		usuarioRepository.saveAll(Arrays.asList(user1));
		
		Agendamento agend1 = new Agendamento(null, "2024-09-12-16-00-00-00", 2, 1, "Corte Viking");
		agendamentoRepository.saveAll(Arrays.asList(agend1));
		
		
	}
}
