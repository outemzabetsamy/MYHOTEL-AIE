-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3308
-- Généré le :  mar. 20 oct. 2020 à 21:50
-- Version du serveur :  5.7.28
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `myhotel`
--

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

DROP TABLE IF EXISTS `chambre`;
CREATE TABLE IF NOT EXISTS `chambre` (
  `numchambre` varchar(100) DEFAULT NULL,
  `numetage` varchar(100) DEFAULT NULL,
  `typechambre` varchar(100) NOT NULL,
  `prixchambre` varchar(100) DEFAULT NULL,
  `nbpersonne` varchar(100) DEFAULT NULL,
  `etatchambre` varchar(100) NOT NULL DEFAULT 'libre'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `chambre`
--

INSERT INTO `chambre` (`numchambre`, `numetage`, `typechambre`, `prixchambre`, `nbpersonne`, `etatchambre`) VALUES
('MyxNteizUhBf11LYnEIyOA==', 'MyxNteizUhBf11LYnEIyOA==', 'dphYAX4T9Db94Fd6tOb30Q==', 'EmnQl15p8fL2y+x5UJAhBQ==', 'B9Wxu8DtVofE8pQaAMm55Q==', 'libre'),
('B9Wxu8DtVofE8pQaAMm55Q==', 'MyxNteizUhBf11LYnEIyOA==', 'bSCnZwj4NCblxvW2EMJHjg==', 'mCrhFFIZhTr1/Im+3jN26A==', 'K3XXkfZU20xcQ8ITHehWcw==', 'libre'),
('K3XXkfZU20xcQ8ITHehWcw==', 'B9Wxu8DtVofE8pQaAMm55Q==', 'zSkVcBTE8eLpzoDfMy+fTw==', 'mCrhFFIZhTr1/Im+3jN26A==', 'B9Wxu8DtVofE8pQaAMm55Q==', 'U6JtkYQoYS4FyfgMZUI9kQ=='),
('mMUrWk1sRgBXZnftYLmROw==', 'K3XXkfZU20xcQ8ITHehWcw==', 'bSCnZwj4NCblxvW2EMJHjg==', 'EmnQl15p8fL2y+x5UJAhBQ==', 'K3XXkfZU20xcQ8ITHehWcw==', 'libre');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `idclient` varchar(100) NOT NULL,
  `nomclient` varchar(100) DEFAULT NULL,
  `prenomclient` varchar(100) DEFAULT NULL,
  `numtel` varchar(100) DEFAULT NULL,
  `age` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idclient`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idclient`, `nomclient`, `prenomclient`, `numtel`, `age`) VALUES
('4Gdk4yGQEJNHgsjWMVxVxMugah4Xq1QkZC9AM/uvNNY=', '9jMvHe5Ec4ZE2jyJerX+eA==', 'g9IJY7vtxlhiO2V1rdNE/w==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('AjWeGL/EPdFBzfyNViuJCe5P5AjKpVKSoV58jMXCYCQ=', '9jMvHe5Ec4ZE2jyJerX+eA==', 'rdLBWT2FrW4cLpbqin41eA==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('ib823CKFReS1QMKOdCCKxu5P5AjKpVKSoV58jMXCYCQ=', '9jMvHe5Ec4ZE2jyJerX+eA==', 'MEXdUGfwNR16/srAKS/vrw==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('3KafjbXmVOfkbG8CNzWBAu5P5AjKpVKSoV58jMXCYCQ=', '9jMvHe5Ec4ZE2jyJerX+eA==', 'MEXdUGfwNR16/srAKS/vrw==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('3muFWl2pIJKMFe4wWIYNs7Uk3BvqffNZ/kqftFk/0tM=', 'LmKHzTb6gczmUjGaJj2kKQ==', 'cO7LekoyCRVNwNZGo1KKEw==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('Ix6j4tNnWmMLUzPbX4X4oA==', 'pNDtW8DJ/+kxV6dDMXHdtA==', 'pNDtW8DJ/+kxV6dDMXHdtA==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('K3k0M8Bv0fUcorC8YM27Uw==', 'pNDtW8DJ/+kxV6dDMXHdtA==', 'a/hOtsAzB5Qm8OFWIZhCWA==', 'null', 'S5vBva67VYmGlm3I3Rvt3w=='),
('wffSTUIbb1Imz2fsByDSIEubwb2uu1WJhpZtyN0b7d8=', '3i/d4VJj4Ecc2/KRf8BNFg==', 'lvv0t26tHcb5tDILqYzC9Q==', 'null', 'S5vBva67VYmGlm3I3Rvt3w==');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `idreservation` int(5) NOT NULL AUTO_INCREMENT,
  `type_reservation` varchar(100) DEFAULT NULL,
  `nbpers` varchar(100) NOT NULL,
  `date_debut` varchar(100) DEFAULT NULL,
  `date_fin` varchar(100) DEFAULT NULL,
  `idclient` varchar(100) NOT NULL,
  `numchambre` varchar(100) NOT NULL,
  PRIMARY KEY (`idreservation`),
  KEY `fk_idclient_reservation` (`idclient`),
  KEY `fk_numchambre_reservation` (`numchambre`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`idreservation`, `type_reservation`, `nbpers`, `date_debut`, `date_fin`, `idclient`, `numchambre`) VALUES
(3, 'yaTyp7MW8lasgh773sDhvQ==', 'B9Wxu8DtVofE8pQaAMm55Q==', 'd1IxS3d0WkNeIdvcwxtekQ==', 'qSqoRn7oksju0pDf126ZsA==', '4Gdk4yGQEJNHgsjWMVxVxMugah4Xq1QkZC9AM/uvNNY=', 'eVuir7ecn02oLolhpG4WpQ=='),
(4, 'yaTyp7MW8lasgh773sDhvQ==', 'B9Wxu8DtVofE8pQaAMm55Q==', 'd1IxS3d0WkNeIdvcwxtekQ==', 'fu9eEBa+Yvo7K3yDVnY54g==', 'AjWeGL/EPdFBzfyNViuJCe5P5AjKpVKSoV58jMXCYCQ=', 'B9Wxu8DtVofE8pQaAMm55Q=='),
(5, 'GUdjDjnGIFbOqlXTsE/YaQ==', 'K3XXkfZU20xcQ8ITHehWcw==', '/CjtEATX0remT3KteHfukw==', 'hwvMj6knd5F6UWuPfGptKA==', 'ib823CKFReS1QMKOdCCKxu5P5AjKpVKSoV58jMXCYCQ=', 'B9Wxu8DtVofE8pQaAMm55Q=='),
(6, 'GUdjDjnGIFbOqlXTsE/YaQ==', 'K3XXkfZU20xcQ8ITHehWcw==', '/CjtEATX0remT3KteHfukw==', 'hwvMj6knd5F6UWuPfGptKA==', '3KafjbXmVOfkbG8CNzWBAu5P5AjKpVKSoV58jMXCYCQ=', 'K3XXkfZU20xcQ8ITHehWcw=='),
(7, 'GUdjDjnGIFbOqlXTsE/YaQ==', 'K3XXkfZU20xcQ8ITHehWcw==', 'Zs2jXAWW2yoE+kjOt+JLxQ==', 'kOAU7+eLP6xP6H1xcWVy8w==', '3muFWl2pIJKMFe4wWIYNs7Uk3BvqffNZ/kqftFk/0tM=', 'K3XXkfZU20xcQ8ITHehWcw=='),
(8, 'GUdjDjnGIFbOqlXTsE/YaQ==', 'K3XXkfZU20xcQ8ITHehWcw==', 'kOAU7+eLP6xP6H1xcWVy8w==', 'gJIE28Xhhw7d94nlTuwfrw==', 'Ix6j4tNnWmMLUzPbX4X4oA==', 'K3XXkfZU20xcQ8ITHehWcw=='),
(9, 'GUdjDjnGIFbOqlXTsE/YaQ==', 'mMUrWk1sRgBXZnftYLmROw==', '4dSORantrlD/OmPA7KLcJQ==', '52WvVNlyYmoKEW5XOlKFpA==', 'K3k0M8Bv0fUcorC8YM27Uw==', 'B9Wxu8DtVofE8pQaAMm55Q=='),
(10, 'GUdjDjnGIFbOqlXTsE/YaQ==', 'mMUrWk1sRgBXZnftYLmROw==', 'VjTqyKlDfua3zoxAlO1oFg==', 'vjFlDsvR+SADg6gTI2g+Sw==', 'wffSTUIbb1Imz2fsByDSIEubwb2uu1WJhpZtyN0b7d8=', 'K3XXkfZU20xcQ8ITHehWcw==');

-- --------------------------------------------------------

--
-- Structure de la table `ressource`
--

DROP TABLE IF EXISTS `ressource`;
CREATE TABLE IF NOT EXISTS `ressource` (
  `idressource` int(11) NOT NULL AUTO_INCREMENT,
  `nom_res` varchar(100) DEFAULT NULL,
  `type_res` varchar(100) DEFAULT NULL,
  `etat_res` varchar(100) DEFAULT NULL,
  `tarif_res` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idressource`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ressource`
--

INSERT INTO `ressource` (`idressource`, `nom_res`, `type_res`, `etat_res`, `tarif_res`) VALUES
(3, '+JMy0DlwlaJJYQK0zIPSyw==', 'xm5ziVCVQqBs+qEiSeDmEQ==', NULL, 'EmnQl15p8fL2y+x5UJAhBQ=='),
(4, 'xJnh3o5zFgs2Psq8nssBYQ==', 'ng3wO0Y2lez9P0MAhOZXnA==', NULL, 'dNxQjDgpkmKCjPvLr0U/hg==');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `idutilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  UNIQUE KEY `pkutilisateur` (`idutilisateur`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idutilisateur`, `username`, `pwd`) VALUES
(1, 'samy', 'samy');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
