-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 26 Août 2021 à 21:25
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestioncreditbailmobilier`
--

-- --------------------------------------------------------

--
-- Structure de la table `achat_materiel`
--

CREATE TABLE IF NOT EXISTS `achat_materiel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agent_id` int(11) DEFAULT NULL,
  `date_achat` datetime DEFAULT NULL,
  `fournisseur_id` int(11) NOT NULL,
  `materiel_id` int(11) DEFAULT NULL,
  `numero_facture` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `prixunitaire` double DEFAULT NULL,
  `quantite` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `acheter`
--

CREATE TABLE IF NOT EXISTS `acheter` (
  `id_fourn` int(11) NOT NULL,
  `matricule_agent` varchar(6) NOT NULL,
  `code_materiel` varchar(6) NOT NULL,
  `num_facture` varchar(10) DEFAULT NULL,
  `dte_achat` date DEFAULT NULL,
  `qte_achat` int(11) DEFAULT NULL,
  `prix` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_fourn`,`matricule_agent`,`code_materiel`),
  KEY `fk_acheter_acheter2_agent` (`matricule_agent`),
  KEY `fk_acheter_acheter3_materiel` (`code_materiel`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `action_traitment`
--

CREATE TABLE IF NOT EXISTS `action_traitment` (
  `id_action` int(11) NOT NULL AUTO_INCREMENT,
  `detail_action` varchar(250) NOT NULL,
  PRIMARY KEY (`id_action`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `administrateur_progiciel`
--

CREATE TABLE IF NOT EXISTS `administrateur_progiciel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identifiant` varchar(200) NOT NULL,
  `passe` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `agent`
--

CREATE TABLE IF NOT EXISTS `agent` (
  `matricule_agent` varchar(6) NOT NULL,
  `id_ste` int(11) NOT NULL,
  `id_fonction` int(11) NOT NULL,
  `nom_agent` varchar(50) DEFAULT NULL,
  `dte_n_agent` date DEFAULT NULL,
  `id` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `datenaiss` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fonction_id` int(11) DEFAULT NULL,
  `genre_id` int(11) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `situation_matrimoniale_id` int(11) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`matricule_agent`),
  KEY `fk_agent_apparteni_ste_acqu` (`id_ste`),
  KEY `fk_agent_occuper_fonction` (`id_fonction`),
  KEY `FKovpocsv8arn7o1pjx55f7b5l3` (`fonction_id`),
  KEY `FKjp6bl7dt6a7t78a37g3g4paex` (`genre_id`),
  KEY `FKtcea7xymjd7fsnr9pribodlgv` (`situation_matrimoniale_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `audite`
--

CREATE TABLE IF NOT EXISTS `audite` (
  `id_suivie` int(11) NOT NULL AUTO_INCREMENT,
  `type_utilisateur` int(11) NOT NULL,
  `id_utilisateur` int(11) NOT NULL,
  `date_connexion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `date_deconnexion` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id_suivie`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `avoir_etat`
--

CREATE TABLE IF NOT EXISTS `avoir_etat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_etat` datetime DEFAULT NULL,
  `etatmateriel_id` int(11) DEFAULT NULL,
  `materiel_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbxuxtwbciouyd13up5pcrrwrh` (`etatmateriel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `banque`
--

CREATE TABLE IF NOT EXISTS `banque` (
  `id_banq` int(11) NOT NULL,
  `nom_banq` varchar(50) DEFAULT NULL,
  `sigle` varchar(10) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `couleur` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_banq`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `categorie_mat`
--

CREATE TABLE IF NOT EXISTS `categorie_mat` (
  `id_cat` int(11) NOT NULL,
  `lib_cat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_cat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `categorie_materiel`
--

CREATE TABLE IF NOT EXISTS `categorie_materiel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id_clt` int(11) NOT NULL AUTO_INCREMENT,
  `Num_Client` varchar(6) NOT NULL,
  `id_sit_mat` int(11) NOT NULL,
  `nom_clt` varchar(50) DEFAULT NULL,
  `contact_clt` varchar(50) DEFAULT NULL,
  `adresse_clt` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `genre_id` int(11) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `sciete_client_id` int(11) NOT NULL,
  `situation_matrimoniale_id` int(11) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_clt`),
  KEY `fk_client_possede_situatio` (`id_sit_mat`),
  KEY `FKoeooaao6fx3s8pyh2gckrjn96` (`genre_id`),
  KEY `FK3ntos015olq1c5ofbnd000kgk` (`sciete_client_id`),
  KEY `FKbcwf5s36g82ykn6ev56dngl2c` (`situation_matrimoniale_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `commander`
--

CREATE TABLE IF NOT EXISTS `commander` (
  `code_materiel` varchar(6) NOT NULL,
  `id_clt` int(11) NOT NULL,
  `qte_cmd` int(11) DEFAULT NULL,
  `nbre_cmd` int(11) DEFAULT NULL,
  PRIMARY KEY (`code_materiel`,`id_clt`),
  KEY `fk_commande_commander_client` (`id_clt`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `commenter_act_traitmt`
--

CREATE TABLE IF NOT EXISTS `commenter_act_traitmt` (
  `id_comt_act` int(11) NOT NULL AUTO_INCREMENT,
  `id_traitmt` int(11) NOT NULL,
  `id_action` int(11) NOT NULL,
  `libele_comment_act` varchar(250) NOT NULL,
  PRIMARY KEY (`id_comt_act`),
  KEY `id_traitmt` (`id_traitmt`,`id_action`),
  KEY `id_action` (`id_action`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `concerner`
--

CREATE TABLE IF NOT EXISTS `concerner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contrat_id` int(11) DEFAULT NULL,
  `materiel_id` int(11) DEFAULT NULL,
  `numserie` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `quantite` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `connecter`
--

CREATE TABLE IF NOT EXISTS `connecter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dateconnexion` datetime DEFAULT NULL,
  `heureconnexion` time DEFAULT NULL,
  `traitements_id` int(11) DEFAULT NULL,
  `utilisateur_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjler7i92vnxw9jyvy7ynuc36c` (`traitements_id`),
  KEY `FKkvtmiig8mrln0mtx5womn96hv` (`utilisateur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `contentieux`
--

CREATE TABLE IF NOT EXISTS `contentieux` (
  `id_contentieux` int(11) NOT NULL,
  `id_litige` int(11) NOT NULL,
  PRIMARY KEY (`id_contentieux`),
  KEY `fk_contenti_decoule_litige` (`id_litige`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `contrat`
--

CREATE TABLE IF NOT EXISTS `contrat` (
  `id_contrat` int(11) NOT NULL AUTO_INCREMENT,
  `code_materiel` varchar(6) NOT NULL,
  `id_clt` int(11) NOT NULL,
  `matricule_agent` int(11) NOT NULL,
  `id_opt_achat` int(11) NOT NULL,
  `date_sign` date DEFAULT NULL,
  `date_fin_prev` date DEFAULT NULL,
  `num_serie` varchar(10) DEFAULT NULL,
  `etat_mat` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `agent_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `date_signature` datetime DEFAULT NULL,
  `datefincontrat` datetime DEFAULT NULL,
  `materiel_id` int(11) DEFAULT NULL,
  `montant` double DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `option_achat_id` int(11) NOT NULL,
  `periode_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_contrat`),
  KEY `fk_contrat_avoir_option_d` (`id_opt_achat`),
  KEY `fk_contrat_concerner_materiel` (`code_materiel`),
  KEY `fk_contrat_signer_client` (`id_clt`),
  KEY `fk_contrat_viser_agent` (`matricule_agent`),
  KEY `FK5vjsg4wxndna3ucgfkb0cxsnk` (`agent_id`),
  KEY `FKat9lypkckqib2kk4sj9u4iw9l` (`client_id`),
  KEY `FK1kvcf23q62ak6qnrsqrequwm5` (`materiel_id`),
  KEY `FK3wvaun0p6e71utwauh8mg01ci` (`option_achat_id`),
  KEY `FKbjhhix80jmygpfsd86lyqg2j7` (`periode_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `deconnecter`
--

CREATE TABLE IF NOT EXISTS `deconnecter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `datedeconnexion` datetime DEFAULT NULL,
  `heuredeconnexion` time DEFAULT NULL,
  `traitements_id` int(11) DEFAULT NULL,
  `utilisateur_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtffav915ostj1ljq2b1n4sgmn` (`traitements_id`),
  KEY `FK7wfvft23omvavhrvedpxiovff` (`utilisateur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `demande_de_credit`
--

CREATE TABLE IF NOT EXISTS `demande_de_credit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `date_com` datetime DEFAULT NULL,
  `materiel_id` int(11) NOT NULL,
  `num_bon_commande` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `qte_com` double DEFAULT NULL,
  `marque_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `detenir`
--

CREATE TABLE IF NOT EXISTS `detenir` (
  `code_materiel` varchar(6) NOT NULL,
  `id_fourn` int(11) NOT NULL,
  PRIMARY KEY (`code_materiel`,`id_fourn`),
  KEY `fk_detenir_detenir2_fourniss` (`id_fourn`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `encaisser`
--

CREATE TABLE IF NOT EXISTS `encaisser` (
  `id_clt` int(11) NOT NULL,
  `id_ste` int(11) NOT NULL,
  `matricule_agent` varchar(6) NOT NULL,
  `id_contrat` int(11) NOT NULL,
  `num_encais` int(11) DEFAULT NULL,
  `date_encais` date DEFAULT NULL,
  `mntnt_encais` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `agent_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `contrat_id` int(11) DEFAULT NULL,
  `date_encaissement` datetime DEFAULT NULL,
  `montant` double DEFAULT NULL,
  `numero_compte` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_clt`,`id_ste`,`matricule_agent`,`id_contrat`),
  KEY `fk_encaisse_encaisser_ste_acqu` (`id_ste`),
  KEY `fk_encaisse_encaisser_agent` (`matricule_agent`),
  KEY `fk_encaisse_encaisser_contrat` (`id_contrat`),
  KEY `FKn45lwmjbsq24e2wptvko47e0i` (`agent_id`),
  KEY `FKsmeh4m5b8g4sq181slr93wkvc` (`client_id`),
  KEY `FKch0vmu2i673j6ssoql40o2o4i` (`contrat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `est_agent`
--

CREATE TABLE IF NOT EXISTS `est_agent` (
  `id_etre` int(11) NOT NULL AUTO_INCREMENT,
  `id_utilisateur` int(11) NOT NULL,
  `id_agent` int(11) NOT NULL,
  PRIMARY KEY (`id_etre`),
  KEY `id_utilisateur` (`id_utilisateur`),
  KEY `id_agent` (`id_agent`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `etat_materiel`
--

CREATE TABLE IF NOT EXISTS `etat_materiel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `fonction`
--

CREATE TABLE IF NOT EXISTS `fonction` (
  `id_fonction` int(11) NOT NULL,
  `lib_fonction` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_fonction`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `formulaire`
--

CREATE TABLE IF NOT EXISTS `formulaire` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `banque` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `coutmateriel` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `datenaiss` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `employeur` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `marque` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `nom` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `nomfournisseur` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `numpiece` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `prenom` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `profession` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `refbancaire` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `telephone` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `typedepiece` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `typemateriel` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `valide` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `id_fourn` int(11) NOT NULL,
  `nom_four` varchar(50) DEFAULT NULL,
  `contact_fourn` varchar(15) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_fourn`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `genre`
--

CREATE TABLE IF NOT EXISTS `genre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `groupe_utilisateur`
--

CREATE TABLE IF NOT EXISTS `groupe_utilisateur` (
  `id_groupe` int(11) NOT NULL AUTO_INCREMENT,
  `groupe_utl` varchar(200) NOT NULL,
  `id` int(11) NOT NULL,
  `datecrea` datetime DEFAULT NULL,
  `motdepassgroup` varchar(255) DEFAULT NULL,
  `niveau_acces_id` int(11) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_groupe`),
  KEY `FKbxgmkca6sfon6mh8yg24cji4g` (`niveau_acces_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `historique`
--

CREATE TABLE IF NOT EXISTS `historique` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `id_agent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `historique_agent_ID_AGENT_fk` (`id_agent`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `litige`
--

CREATE TABLE IF NOT EXISTS `litige` (
  `id_litige` int(11) NOT NULL,
  `id_type_lit` int(11) NOT NULL,
  `cause` mediumtext,
  PRIMARY KEY (`id_litige`),
  KEY `fk_litige_contenir_type_lit` (`id_type_lit`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `marque`
--

CREATE TABLE IF NOT EXISTS `marque` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

CREATE TABLE IF NOT EXISTS `materiel` (
  `code_materiel` varchar(6) NOT NULL,
  `id_cat` int(11) NOT NULL,
  `lib_materiel` char(10) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `categorie_materiel_id` int(11) DEFAULT NULL,
  `fournisseur_id` int(11) DEFAULT NULL,
  `immatriculation` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `marque_id` int(11) DEFAULT NULL,
  `prix` double DEFAULT NULL,
  PRIMARY KEY (`code_materiel`),
  KEY `fk_materiel_correspon_categori` (`id_cat`),
  KEY `FKgv53oe6le6a9iawjs7pfvaba4` (`categorie_materiel_id`),
  KEY `FKon81aq9p0rn9fyafjkjklp2kg` (`fournisseur_id`),
  KEY `FKtpo78y23tg2ty14owlbrf20dw` (`marque_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `message_erreurs`
--

CREATE TABLE IF NOT EXISTS `message_erreurs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `msg_erreur`
--

CREATE TABLE IF NOT EXISTS `msg_erreur` (
  `code_msg_erreur` varchar(4) NOT NULL,
  `msg` mediumtext,
  PRIMARY KEY (`code_msg_erreur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `niveau_acces`
--

CREATE TABLE IF NOT EXISTS `niveau_acces` (
  `id_acces` int(11) NOT NULL AUTO_INCREMENT,
  `niveau_acces` char(2) NOT NULL,
  `id` int(11) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_acces`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `occuper`
--

CREATE TABLE IF NOT EXISTS `occuper` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agent_id` int(11) DEFAULT NULL,
  `date_prise_de_fonction` datetime DEFAULT NULL,
  `fonction_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `option_achat`
--

CREATE TABLE IF NOT EXISTS `option_achat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `option_d_achat`
--

CREATE TABLE IF NOT EXISTS `option_d_achat` (
  `id_opt_achat` int(11) NOT NULL,
  `lib_opt_achat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_opt_achat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `passer`
--

CREATE TABLE IF NOT EXISTS `passer` (
  `id_litige` int(11) NOT NULL,
  `matricule_agent` varchar(6) NOT NULL,
  `id_contrat` int(11) NOT NULL,
  PRIMARY KEY (`id_litige`,`matricule_agent`,`id_contrat`),
  KEY `fk_passer_passer2_agent` (`matricule_agent`),
  KEY `fk_passer_passer3_contrat` (`id_contrat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `periode`
--

CREATE TABLE IF NOT EXISTS `periode` (
  `id_periode` int(11) NOT NULL,
  `date_periode` date DEFAULT NULL,
  `lib_periode` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_periode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `prelever`
--

CREATE TABLE IF NOT EXISTS `prelever` (
  `id_clt` int(11) NOT NULL,
  `id_banq` int(11) NOT NULL,
  `id_contrat` int(11) NOT NULL,
  `num_cpte_clt` varchar(12) DEFAULT NULL,
  `dte_prel` date DEFAULT NULL,
  `mntnt_prel` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `agent_id` int(11) DEFAULT NULL,
  `banque_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `contrat_id` int(11) DEFAULT NULL,
  `date_prelevement` datetime DEFAULT NULL,
  `montant` double DEFAULT NULL,
  `numero_compte` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_clt`,`id_banq`,`id_contrat`),
  KEY `fk_prelever_prelever2_banque` (`id_banq`),
  KEY `fk_prelever_prelever3_contrat` (`id_contrat`),
  KEY `FKeee9ghyhsuoqsrck96bgnrfds` (`agent_id`),
  KEY `FKcglno23cs7jfyfe211uqrdt1j` (`banque_id`),
  KEY `FKp9tcftovsgsygmp5eturygqk9` (`client_id`),
  KEY `FKp722lxgy1rqluo2l8ruorr8af` (`contrat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rattacher`
--

CREATE TABLE IF NOT EXISTS `rattacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `groupe_utilisateur_id` int(11) DEFAULT NULL,
  `traitements_id` int(11) DEFAULT NULL,
  `utilisateur_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjs847ooy0i244hc928ptwernk` (`traitements_id`),
  KEY `FKd19bx43wqyss71uuwtd2mp4l7` (`utilisateur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `recevoir_materiel`
--

CREATE TABLE IF NOT EXISTS `recevoir_materiel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) DEFAULT NULL,
  `date_acquisition` datetime DEFAULT NULL,
  `materiel_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `sciete_client`
--

CREATE TABLE IF NOT EXISTS `sciete_client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `nom` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `telephone` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `sequencer`
--

CREATE TABLE IF NOT EXISTS `sequencer` (
  `id_contrat` int(11) NOT NULL,
  `id_periode` int(11) NOT NULL,
  PRIMARY KEY (`id_contrat`,`id_periode`),
  KEY `fk_sequence_sequencer_periode` (`id_periode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `situation_mat`
--

CREATE TABLE IF NOT EXISTS `situation_mat` (
  `id_situation_mat` int(11) NOT NULL,
  `lib_situation_mat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_situation_mat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `situation_matrimoniale`
--

CREATE TABLE IF NOT EXISTS `situation_matrimoniale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `societe_acquereuse`
--

CREATE TABLE IF NOT EXISTS `societe_acquereuse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `couleur` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `logo` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `nom` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `sigle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `telephone` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `ste_acquerante`
--

CREATE TABLE IF NOT EXISTS `ste_acquerante` (
  `id_ste` int(11) NOT NULL,
  `nom_ste` varchar(50) DEFAULT NULL,
  `banq` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_ste`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `table_action`
--

CREATE TABLE IF NOT EXISTS `table_action` (
  `code_table` varchar(100) NOT NULL,
  `detail_action` varchar(200) NOT NULL,
  `detail_traitement` varchar(200) NOT NULL,
  `id_utilisateur` int(11) NOT NULL,
  PRIMARY KEY (`code_table`),
  KEY `id_utilisateur` (`id_utilisateur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `traitement`
--

CREATE TABLE IF NOT EXISTS `traitement` (
  `id_traitmt` int(11) NOT NULL AUTO_INCREMENT,
  `detail_traitmt` varchar(250) NOT NULL,
  PRIMARY KEY (`id_traitmt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `traitements`
--

CREATE TABLE IF NOT EXISTS `traitements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `type_litige`
--

CREATE TABLE IF NOT EXISTS `type_litige` (
  `id_type_lit` int(11) NOT NULL,
  `lib_type_lit` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_type_lit`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `type_utilisateurs`
--

CREATE TABLE IF NOT EXISTS `type_utilisateurs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `datecrea` datetime DEFAULT NULL,
  `fonction_id` int(11) DEFAULT NULL,
  `groupe_utilisateur_id` int(11) DEFAULT NULL,
  `motdepass` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `nom` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `id_utilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `nom_utilisateur` varchar(250) NOT NULL,
  `passe_utilisateur` varchar(200) DEFAULT NULL,
  `id_groupe_utl` int(11) NOT NULL,
  `id_niv_acces` int(11) NOT NULL,
  PRIMARY KEY (`id_utilisateur`),
  KEY `groupe_utl` (`id_groupe_utl`,`id_niv_acces`),
  KEY `utlisateurs_ibfk_2` (`id_niv_acces`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`id_utilisateur`, `nom_utilisateur`, `passe_utilisateur`, `id_groupe_utl`, `id_niv_acces`) VALUES
(1, 'Desi', '12345D', 2, 2),
(2, 'Ange', '12345A', 4, 4);

-- --------------------------------------------------------

--
-- Structure de la table `versement`
--

CREATE TABLE IF NOT EXISTS `versement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agent_id` int(11) DEFAULT NULL,
  `banque_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `contrat_id` int(11) DEFAULT NULL,
  `dateversement` datetime DEFAULT NULL,
  `montant` double DEFAULT NULL,
  `numero_compte` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `verser`
--

CREATE TABLE IF NOT EXISTS `verser` (
  `id_ste` int(11) NOT NULL,
  `id_banq` int(11) NOT NULL,
  `id_contrat` int(11) NOT NULL,
  `num_cpte_ste` varchar(12) DEFAULT NULL,
  `dte_vers` date DEFAULT NULL,
  `montant_vers` float DEFAULT NULL,
  PRIMARY KEY (`id_ste`,`id_banq`,`id_contrat`),
  KEY `fk_verser_verser2_banque` (`id_banq`),
  KEY `fk_verser_verser3_contrat` (`id_contrat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `avoir_etat`
--
ALTER TABLE `avoir_etat`
  ADD CONSTRAINT `FKbxuxtwbciouyd13up5pcrrwrh` FOREIGN KEY (`etatmateriel_id`) REFERENCES `etat_materiel` (`id`);

--
-- Contraintes pour la table `connecter`
--
ALTER TABLE `connecter`
  ADD CONSTRAINT `FKkvtmiig8mrln0mtx5womn96hv` FOREIGN KEY (`utilisateur_id`) REFERENCES `utilisateur` (`id`),
  ADD CONSTRAINT `FKjler7i92vnxw9jyvy7ynuc36c` FOREIGN KEY (`traitements_id`) REFERENCES `traitements` (`id`);

--
-- Contraintes pour la table `deconnecter`
--
ALTER TABLE `deconnecter`
  ADD CONSTRAINT `FK7wfvft23omvavhrvedpxiovff` FOREIGN KEY (`utilisateur_id`) REFERENCES `utilisateur` (`id`),
  ADD CONSTRAINT `FKtffav915ostj1ljq2b1n4sgmn` FOREIGN KEY (`traitements_id`) REFERENCES `traitements` (`id`);

--
-- Contraintes pour la table `rattacher`
--
ALTER TABLE `rattacher`
  ADD CONSTRAINT `FKd19bx43wqyss71uuwtd2mp4l7` FOREIGN KEY (`utilisateur_id`) REFERENCES `utilisateur` (`id`),
  ADD CONSTRAINT `FKjs847ooy0i244hc928ptwernk` FOREIGN KEY (`traitements_id`) REFERENCES `traitements` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
