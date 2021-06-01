<%-- 
    Document   : teste
    Created on : 31 de mai de 2021, 17:59:05
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="br">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Next Trip - Países</title>
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <header>
            <h1 class="site-heading text-center text-faded d-none d-lg-block">
                <span class="site-heading-upper text-primary mb-3"> Encontre o melhor destino para sua viagem!</span>
                <span class="site-heading-lower">NexTrip</span>

            </h1>
        </header>
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
            <div class="container">
                <a class="navbar-brand text-uppercase fw-bold d-lg-none" href="index.html">Start Bootstrap</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mx-auto">
                        <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="index.html">Pagina Inicial</a></li>
                        <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="votacao.html">Votação</a></li>
                        <li class="nav-item px-lg-4"><a class="nav-link text-uppercase" href="paises.html">Países</a></li>

                    </ul>
                </div>
            </div>
        </nav>
        <section class="page-section">
            <div class="container">
                <div class="product-item">
                    <div class="product-item-title d-flex">
                        <div class="bg-faded p-5 d-flex ms-auto rounded">
                            <h2 class="section-heading mb-0">

                                <span class="section-heading-lower">TUNÍSIA</span>

                            </h2>
                        </div>
                    </div>
                    <img class="product-item-img mx-auto d-flex rounded img-fluid mb-3 mb-lg-0" src="assets/img/products-01.jpg" alt="..." />
                    <div class="product-item-description d-flex me-auto">
                        <div class="bg-faded p-5 rounded">
                            <p class="mb-0">Localizado no Norte da África, próximo ao Marrocos e ao Sul da Europa, a Tunísia é um destino completo: desertos, oásis e praias cristalinas que lembram a Grécia formam paisagens de tirar o fôlego. Os preços arrasadores dos hotéis e resorts tornam a Tunísia ainda mais atrativa, já que esse é um dos países mais baratos do mundo para se viajar</p>
                            <p class="mb-0">*API COTAÇÂO</p>
                            <a href="VotoController?action=voto1" class="btn btn-outline-primary" role="button" aria-pressed="true" id="btTunisia" >Votar</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="page-section">
            <div class="container">
                <div class="product-item">
                    <div class="product-item-title d-flex">
                        <div class="bg-faded p-5 d-flex me-auto rounded">
                            <h2 class="section-heading mb-0">

                                <span class="section-heading-lower">CUBA</span>
                            </h2>
                        </div>
                    </div>
                    <img class="product-item-img mx-auto d-flex rounded img-fluid mb-3 mb-lg-0" src="assets/img/products-02.jpg" alt="..." />
                    <div class="product-item-description d-flex ms-auto">
                        <div class="bg-faded p-5 rounded"><p class="mb-0">Cuba é um destino rico em história e cultura, com lindas praias em pleno Caribe. Antes da unificação monetária realizada em janeiro de 2021, o país tinha duas moedas em circulação, uma para os locais e outra para os turistas, embora nada impedisse que você usasse as duas. Quem gastava na moeda turística paralela encontrava preços mais altos, mas quem arriscava com a moeda local poderia encontrar valores surrealmente baratos, na casa dos centavos. Atualmente, com o CUP (peso cubano) como única moeda oficial em circulação, os preços tendem a subir um pouco.</p><p class="mb-0">*API COTAÇÂO</p>
                            <a href="VotoController?action=voto2" class="btn btn-outline-primary" role="button" aria-pressed="true" id="btTunisia" >Votar</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="page-section">
            <div class="container">
                <div class="product-item">
                    <div class="product-item-title d-flex">
                        <div class="bg-faded p-5 d-flex ms-auto rounded">
                            <h2 class="section-heading mb-0">

                                <span class="section-heading-lower">TURQUIA</span>
                            </h2>
                        </div>
                    </div>
                    <img class="product-item-img mx-auto d-flex rounded img-fluid mb-3 mb-lg-0" src="assets/img/products-03.jpg" alt="..." />
                    <div class="product-item-description d-flex me-auto">
                        <div class="bg-faded p-5 rounded"><p class="mb-0">Cultura instigante, gastronomia de primeira, arquitetura única, praias cristalinas, passeios inesquecíveis de balão e quartos românticos esculpidos na rocha. Seja em Istambul ou na Capadócia, a Turquia nunca é mais o mesmo e sempre surpreende o visitante com novas atrações e sabores, a preços cada vez mais baixos.</p><p class="mb-0">*API COTAÇÂO</p>
                            <a href="VotoController?action=voto3" class="btn btn-outline-primary" role="button" aria-pressed="true" id="btTunisia" >Votar</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="page-section">
            <div class="container">
                <div class="product-item">
                    <div class="product-item-title d-flex">
                        <div class="bg-faded p-5 d-flex me-auto rounded">
                            <h2 class="section-heading mb-0">

                                <span class="section-heading-lower">Egito</span>
                            </h2>
                        </div>
                    </div>
                    <img class="product-item-img mx-auto d-flex rounded img-fluid mb-3 mb-lg-0" src="assets/img/products-04.jpg" alt="..." />
                    <div class="product-item-description d-flex ms-auto">
                        <div class="bg-faded p-5 rounded"><p class="mb-0">Quem diria, um dos países mais antigos do mundo e berço da Civilização, também é um dos mais baratos para se viajar! Se você achava que para visitar as pirâmides e andar de camelo era preciso ter um tesouro digno de faraó, repense! Boa parte do acervo histórico e cultural egípcio encontra-se bem preservado e facilmente acessível a partir da capital Cairo, uma megalópole de mais de 9 milhões de habitantes.</p><p class="mb-0">*API COTAÇÂO</p>
                            <a href="VotoController?action=voto4" class="btn btn-outline-primary" role="button" aria-pressed="true" id="btTunisia" >Votar</a>
                        </div>
                    </div>
                </div>
            </div>
            <section class="page-section">
                <div class="container">
                    <div class="product-item">
                        <div class="product-item-title d-flex">
                            <div class="bg-faded p-5 d-flex ms-auto rounded">
                                <h2 class="section-heading mb-0">
                                    <span class="section-heading-lower">ALBÂNIA</span>
                                </h2>
                            </div>
                        </div>
                        <img class="product-item-img mx-auto d-flex rounded img-fluid mb-3 mb-lg-0" src="assets/img/products-05.jpg" alt="..." />
                        <div class="product-item-description d-flex me-auto">
                            <div class="bg-faded p-5 rounded"><p class="mb-0">Quem disse que curtir as praias do verão europeu é sinônimo de preços altos? Sim, você pode gastar muito no litoral da Grécia ou Itália, ou simplesmente viajar para a Albânia, localizada entre os dois países e com as mesmas paisagens, a uma fração do preço! A Albânia já foi considerada a nação mais fechada da Europa, mas atualmente se abriu ao turismo sem perder sua autenticidade. Um destino com algumas das praias mais lindas do continente europeu.</p><p class="mb-0">*API COTAÇÂO</p>
                                <a href="VotoController?action=voto5" class="btn btn-outline-primary" role="button" aria-pressed="true" id="btTunisia" >Votar</a>
                            </div>
                        </div>
                    </div>
                </div>
                <footer class="footer text-faded text-center py-5">
                    <div class="container"><p class="m-0 small">Copyright &copy; UCB - Ceilândia</p></div>
                </footer>
                <!-- Bootstrap core JS-->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
                <!-- Core theme JS-->
                <script src="js/scripts.js"></script>
                </body>
                </html>

