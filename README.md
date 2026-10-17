
Activité 1 : Couplage faible et instanciation statique

1. Qu'est-ce qu'un couplage fort ?

Le couplage fort existe lorsqu'une classe dépend directement d'une classe concrète. Par exemple, si une classe métier crée elle-même un objet DAO avec `new`, elle dépend de cette implémentation. Si on veut changer cette classe, il faut souvent modifier le code métier.

2. Qu'est-ce qu'un couplage faible ?

Le couplage faible consiste à réduire les dépendances entre les classes en utilisant des interfaces. La classe métier dépend d'une interface plutôt que d'une implémentation précise. On peut ainsi changer l'implémentation sans modifier la logique métier.

3. Quel est le rôle d'une interface ?

Une interface définit un contrat qui précise les méthodes qu'une classe doit implémenter. Elle permet de séparer le fonctionnement attendu de son implémentation. Cela facilite la maintenance, les tests et l'évolution de l'application.

4. Pourquoi utiliser un setter ou un constructeur ?

Le setter ou le constructeur permet d'injecter une dépendance dans une classe depuis l'extérieur. Par exemple, on peut fournir un objet DAO à la classe métier sans que celle-ci ait besoin de le créer elle-même. Cela rend le code plus flexible et réduit le couplage.

 Activité 2 : 
 
1. Qu'est-ce que l'instanciation dynamique ?

L'instanciation dynamique consiste à créer un objet pendant l'exécution du programme. Le nom de la classe peut être récupéré depuis un fichier de configuration, ce qui permet de choisir l'implémentation sans la définir directement dans le code source.

2. Comment fonctionne la réflexion (*Reflection*) en Java ?

La réflexion permet à Java d'examiner et de manipuler les classes pendant l'exécution. Par exemple, `Class.forName()` permet de charger une classe à partir de son nom complet. On peut ensuite créer un objet et appeler ses méthodes dynamiquement.

 3. Quel est l'intérêt par rapport à l'instanciation statique ?

L'instanciation dynamique rend l'application plus flexible. Par exemple, pour remplacer `DaoImpl` par `DaoImplV2`, on peut modifier le fichier de configuration au lieu de modifier directement le code métier. Cela évite généralement de modifier et de recompiler le code source, à condition que la nouvelle classe soit disponible et compatible.

 Activité 3 : 

 1. Qu'est-ce que l'Inversion de Contrôle (IoC) ?

L'Inversion de Contrôle est un principe de conception dans lequel la création et la gestion des objets sont confiées à un conteneur externe plutôt qu'au code de l'application. Avec Spring, le conteneur prend en charge la création des objets et l'injection de leurs dépendances.

2. Qu'est-ce que le conteneur Spring (`ApplicationContext`) ?

`ApplicationContext` est une interface centrale de Spring qui représente un conteneur IoC. Il lit la configuration, crée et gère les objets appelés *beans*, puis fournit les dépendances nécessaires à leur fonctionnement.

3. Quel est le rôle du fichier XML (`config.xml`) ?

Le fichier XML permet de déclarer les beans que Spring doit gérer et de définir leurs relations. Par exemple, il peut indiquer que le bean `dao` doit être injecté dans le bean `metier` à l'aide de la propriété `property`.

 Activité 4 : Injection de dépendances avec les annotations Spring

 1. Pourquoi utiliser les annotations au lieu du XML ?

Les annotations permettent de déclarer directement dans le code Java le rôle des classes et certaines règles de configuration. Elles réduisent la configuration XML et rendent le code plus facile à organiser. Le XML reste toutefois utile dans certains projets.

2. À quoi servent les principales annotations ?

- `@Repository` : indique qu'une classe appartient à la couche d'accès aux données (DAO).
- `@Service` : indique qu'une classe contient la logique métier.
- `@Autowired` : demande à Spring d'injecter automatiquement une dépendance compatible. Cette injection peut se faire par constructeur, setter ou champ.
3. Qu'est-ce que le *Component Scanning* ?

Le *Component Scanning* permet à Spring de rechercher automatiquement, dans les packages configurés, les classes annotées avec `@Component`, `@Repository`, `@Service` ou d'autres annotations reconnues. Spring peut alors enregistrer ces classes comme beans sans devoir les déclarer individuellement dans un fichier XML.

