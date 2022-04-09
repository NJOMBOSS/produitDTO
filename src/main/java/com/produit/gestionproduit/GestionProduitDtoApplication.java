package com.produit.gestionproduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionProduitDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProduitDtoApplication.class, args);
	}

	/*@Bean
	CommandLineRunner start(CaissierService caissierService, CategorieService categorieService,
							ProduitService produitService, VenteService venteService,
							CategorieRepository categorieRepository, ProduitRepository produitRepository,
							CaissierRepository caissierRepository, VenteRepository venteRepository) {

		return args -> {

			System.out.println("****************************************************");


			categorieService.saveCategorie(
					CategorieRequestDTO.builder()
							.nomCat("Consommable")
							.descriptionCat("Produit alimentaire")
							.build()
			);

			categorieService.saveCategorie(
					CategorieRequestDTO.builder()
							.nomCat("Vêtement")
							.descriptionCat("Produit vestimentaire")
							.build()
			);

			categorieService.saveCategorie(
					CategorieRequestDTO.builder()
							.nomCat("Bonbon")
							.descriptionCat("Sucrerie")
							.build()
			);

			categorieService.saveCategorie(
					CategorieRequestDTO.builder()
							.nomCat("Vaisselle")
							.descriptionCat("Produit de vaisselle")
							.build()
			);

			categorieService.listCategorie().forEach(cat -> {

				System.out.println(cat.getNomCat() + "  " + cat.getDescriptionCat());
			});

			System.out.println("****************************************************");

			categorieRepository.findById(1L).ifPresent(categorie -> {
					produitService.saveProduit(
							ProduitRequestDTO.builder()
								.nomP("Farine")
								.description("Description")
								.dateExpiration(new Date())
								.dateFabrication(new Date())
								.quantite(100)
								.ispromotion(true)
								.categorie(categorie)
								.build()
				);

			});

			categorieRepository.findById(2L).ifPresent(categorie -> {
				produitService.saveProduit(
						ProduitRequestDTO.builder()
								.nomP("Savon")
								.description("liquige")
								.dateExpiration(new Date())
								.dateFabrication(new Date())
								.quantite(80)
								.ispromotion(false)
								.categorie(categorie)
								.build()

				);

			});

			categorieRepository.findById(2L).ifPresent(categorie -> {
				produitService.saveProduit(
						ProduitRequestDTO.builder()
								.nomP("Cube")
								.description("maggie")
								.dateExpiration(new Date())
								.dateFabrication(new Date())
								.quantite(80)
								.ispromotion(false)
								.categorie(categorie)
								.build()

				);

			});

				produitService.listProduit().forEach(prod -> {

					System.out.println(prod.getNomP() + "  " + prod.getDescription() + " " +
							prod.getDateExpiration() + "  " + prod.getDateFabrication() + "  " + prod.getQuantite()
							+ "  " + prod.isIspromotion() + "  " + prod.getCategorie().getIdCat());
				});

				System.out.println("****************************************************");

				caissierService.saveCaissier(
						CaissierRequestDTO.builder()
								.nomCaissier("FONKE Eric")
								.build()
				);

				caissierService.saveCaissier(
						CaissierRequestDTO.builder()
								.nomCaissier("Eto'o Fils")
								.build()
				);

				caissierService.saveCaissier(
						CaissierRequestDTO.builder()
								.nomCaissier("Jacque Dupont")
								.build()
				);

				caissierService.listCaissier().forEach(caissier -> {
					System.out.println(caissier.getNomCaissier());
				});

				System.out.println("****************************************************");

			caissierRepository.findById(1L).ifPresent(caissier -> {
				produitRepository.findById(1L).ifPresent(produit -> {
					venteService.saveVente(
							VenteRequestDTO.builder()
									.dateVente(new Date())
									.quantitéVendu(10)
									.caissier(caissier)
									.produit(produit)
									.build()
					);
				});
			});

			caissierRepository.findById(2L).ifPresent(caissier -> {
				produitRepository.findById(3L).ifPresent(produit -> {
						venteService.saveVente(
							VenteRequestDTO.builder()
									.dateVente(new Date())
									.quantitéVendu(40)
									.caissier(caissier)
									.produit(produit)
									.build()
					);
				});
			});

			caissierRepository.findById(3L).ifPresent(caissier -> {
				produitRepository.findById(2L).ifPresent(produit -> {
					venteService.saveVente(
							VenteRequestDTO.builder()
									.dateVente(new Date())
									.quantitéVendu(1500)
									.caissier(caissier)
									.produit(produit)
									.build()
					);
				});
			});

			venteRepository.findAll().forEach(vente -> {
				System.out.println(vente.getDateVente()+" "+ vente.getQuantitéVendu()+" "+ vente.getCaissier().getId()
				+" "+vente.getProduit().getIdP());
			});
		};


		};*/

}