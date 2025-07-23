### According to the definition by Len Bass and his co-authors, what does the structure of a system's architecture comprise?

- [ ] The programming languages and frameworks used.
- [x] Software elements, their externally visible properties, and the relationships among them.
- [ ] The team structure and development process.
- [ ] The project's budget and timeline.
- [ ] The hardware on which the system will run.

**Rationale:** The text states, "The most commonly used definition of software architecture comes from Len Baas and his co-authors... There it is defined that architecture is the structure of structures of the system which comprises software elements, the externally visible properties of those elements, and the relationships among them."

### Which of the following statements is a valid conclusion derived from Len Bass's definition of software architecture?

- [ ] A system has only one, rigidly defined structure.
- [ ] The architecture is a direct representation of the code, not an abstraction.
- [x] Every system possesses an architecture, regardless of whether it was intentionally planned or not.
- [ ] Architectural documentation should only exist at the class level.

**Rationale:** The text explicitly mentions, "And finally, every system has an architecture, regardless of whether it was planned or not."

### What is the central idea behind the definition "Software architecture is the sum of all important definitions made during the development process"?

- [ ] Architecture is primarily about the physical structure of servers.
- [ ] Only decisions made at the beginning of a project are important.
- [x] Architecture is fundamentally about the significant decisions made, such as choosing a framework or programming language.
- [ ] The structure of the source code is irrelevant to the architecture.

**Rationale:** The text explains, "Software architecture is the sum of all important definitions made during the development process... It's all about decisions. But what are important decisions? Important decisions are such decisions that are either fundamental, such as the choice of a front-end framework, for example, or decisions that are difficult to revise in the future, for example, deciding which programming language to use."

### What future-oriented aspect does the definition "Software Architecture is a framework for change" emphasize?

- [ ] That architecture should resist all changes to maintain stability.
- [ ] That changes in the future are impossible to predict and therefore cannot be planned for.
- [x] That a good architecture should be prepared for and able to accommodate likely future changes.
- [ ] That architecture is only relevant for the initial development phase.

**Rationale:** The text states, "This definition by Andreas Rausch, Software Architecture is a framework for change, emphasizes the fact that software architecture has an impact on the future. An important reason for software architecture is to take future changes into account. A good architecture is prepared for obvious future changes."

### What is the core of the ISAQB's definition of software architecture?

- [ ] The documentation of every single class and function.
- [ ] The specific choice of database technology.
- [x] The structure of a system, consisting of building blocks, interfaces, and their relationships to each other and the environment.
- [ ] The strict adherence to a single communication protocol, like asynchronous communication.

**Rationale:** The text highlights, "The next two bullet points are the most important for this definition. The structure of a system consists of building blocks and interfaces and their relationships to each other and the environment. This is the core of the definition..."

### When describing the architecture of a system at the module level, what do "elements," "externally visible properties," and "relationships" refer to, according to Len Bass's definition?

- [ ] Elements are classes, properties are methods, relationships are inheritance.
- [x] Elements are modules, properties are services offered, relationships are calls from one module to another.
- [ ] Elements are functions, properties are return types, relationships are variable assignments.
- [ ] Elements are files, properties are file sizes, relationships are file paths.

**Rationale:** The text states: "If we describe the architecture of a system at the level of modules, then the modules are the elements. The services that a module offers are its externally visible properties and the calls from one module to another are the relationships among them."

### What is a key implication of the definition "Software architecture is the sum of all important definitions made during the development process"?

- [ ] It means that only the initial design phase is important for architecture.
- [x] It suggests that documenting architectural decisions might be more beneficial than documenting the structure itself.
- [ ] It implies that the structure of the source code is independent of architectural decisions.
- [ ] It focuses solely on the technical aspects, ignoring business decisions.

**Rationale:** The text explains: "The focus of this definition is descriptive and therefore good for documentation. This definition also emphasizes that the structure of your source code is a result of all decisions made. It might be better to document the decisions than the structure."

### What is the primary focus of Ayon Woods' definition of software architecture, "Software Architecture, is the set of decisions which, if made incorrectly, may cause your project to be canceled"?

- [ ] To emphasize the importance of early project completion.
- [ ] To highlight the need for extensive documentation.
- [x] To underscore the potential negative consequences of poor architectural decisions on project success.
- [ ] To promote the use of specific architectural patterns.

**Rationale:** The text states: "This definition by Ayon Woods, Software Architecture, is the set of decisions which, if made incorrectly, may cause your project to be canceled, focuses on the success of a software project. It highlights the possible negative aspects of poor architecture decisions and the initial phase of the project can cause a lot of rework and redesign later on."

### According to the ISAQB's definition, what is the scope of software architecture regarding the system's life cycle?

- [ ] It only provides guidelines for the initial analysis and design phases.
- [ ] It is primarily concerned with the implementation and testing phases.
- [x] It provides guidelines for the entire system life cycle, from analysis and design to implementation, operation, and future development.
- [ ] It focuses exclusively on post-deployment maintenance.

**Rationale:** The text states: "Software architecture provides guidelines for the entire system life cycle, starting with analysis, design and implementation through to operation and future development."

### Which of the following are considered "building blocks" in software architecture, according to the text?

- [x] A package or a namespace.
- [x] Programming constructs like classes, modules, or functions.
- [ ] The development team's communication strategy.
- [x] Libraries and frameworks.
- [x] Configurations and data structures.
- [ ] The project management methodology.

**Rationale:** The text provides a list of what can be considered a building block: "A building block could be a package or a namespace... A building block can also be programming constructs such as classes, modules, functions, procedures, components, programs or scripts. Libraries and frameworks are also considered building blocks. Building blocks which are more like description elements are configurations and declarations that can be data structures, data tables or considerations for user interface layout and mapping definitions."

### What are the three fundamental aspects of building blocks discussed in the text?

- [ ] Naming, versioning, and documentation.
- [x] Export/import interfaces, encapsulation of implementation, and hierarchical composition.
- [ ] Performance, security, and scalability.
- [ ] The programming language, the author, and the date of creation.

**Rationale:** The text explicitly lists three basic aspects: "Firstly, all building blocks have export and import interfaces... Second, the building block encapsulates and thereby hides its implementation... The third aspect is the configuration and the hierarchical composition."

### Which of the following are the three fundamental aspects of building blocks discussed in the text?

- [x] All building blocks have export and import interfaces
- [x] Building blocks encapsulate and hide their implementation
- [x] Building blocks have hierarchical composition and configuration
- [ ] Building blocks must be written in object-oriented languages
- [ ] Building blocks require extensive documentation
- [ ] Building blocks must follow specific naming conventions

**Rationale:** The text explicitly lists three basic aspects: "Firstly, all building blocks have export and import interfaces... Second, the building block encapsulates and thereby hides its implementation... The third aspect is the configuration and the hierarchical composition." This format allows evaluation of understanding of each individual aspect.

### Which view of a building block is intended for an architect designing the overall system structure, showing only export and import interfaces without revealing the internal structure?

- [ ] The White Box View
- [x] The Black Box View
- [ ] The Gray Box View
- [ ] The Glass Box View

**Rationale:** The text states, "In the black box view or so-called outsider view, only the export and import interfaces are shown. This view is intended for the architect trying to design a structure from structures of the entire system. For this task, it is not necessary to understand the internal structure of the black box."

### What is the primary purpose of the "White Box View" of a building block?

- [ ] To show how the building block interacts with external systems.
- [ ] To provide a high-level overview for project managers.
- [x] To reveal the internal structure and decomposition into sub-building blocks for the implementer.
- [ ] To display only the configuration parameters for system administrators.

**Rationale:** The text explains, "In contrast, the white box view or glass box view or interior view reveals the internal structure and decomposition into sub-building blocks. This is the view of the building block implementer."

### According to the text, what does the architect influence when designing the white box decomposition of a building block?

- [ ] The overall project budget.
- [ ] The marketing strategy for the software.
- [x] The coupling between and the testability of the embodied building blocks.
- [ ] The choice of hardware for deployment.

**Rationale:** The text states, "Moreover, the white box decomposition influences the coupling between and the testability of the embodied building blocks."

### What is the primary purpose of the "Gray Box View" of a building block, and for whom is it primarily intended?

- [ ] To show the complete internal structure for implementers.
- [ ] To hide all internal details for high-level architects.
- [x] To reveal some parts of the internal structure that describe the connection of sub-building blocks' interfaces, making it important for configurators.
- [ ] To display only the external dependencies of the building block.

**Rationale:** The text states: "The gray box view is somehow in between. Some parts of the internal structure are visible, namely those parts that describe the connection of the export and import interfaces of the sub-building blocks inside the building block. That's why this view is important for configurators."

### When designing the black box view of a building block, what aspects does the architect influence?

- [x] The implementation of functional requirements.
- [x] The implementation of non-functional requirements.
- [x] The properties of the export interface.
- [x] The amount of coupling with other building blocks.
- [ ] The specific programming language used for internal implementation.
- [ ] The daily tasks of the development team.

**Rationale:** The text states: "With the design of the black box view of a building block, the architect influences the implementation of the functional as well as the non-functional requirements. Moreover, he or she defines the properties of the export interface and the amount of coupling with other building blocks."

### What can the export interface of a building block consist of?

- [x] Functions
- [x] Methods
- [ ] Internal variables
- [x] Procedures
- [x] Types
- [x] Constancies
- [ ] Private classes

**Rationale:** The text states: "The export interface can be functions or methods or procedures, types and constancies."

### What is the fundamental purpose of an interface for a building block in software architecture?

- [ ] To hide the building block from the rest of the system.
- [x] To represent a well-defined access point to the system or its elements.
- [ ] To define the internal implementation details of the building block.
- [ ] To automatically generate user documentation.

**Rationale:** The text opens by stating, "An interface of a building block represents a well-defined access point to the system or its elements."

### Which of the following aspects are necessary to make an interface "well-defined" according to the text?

- [x] The syntax, data structures, and functional behavior.
- [ ] The name of the lead developer who created it.
- [x] The behavior in the event of an error and non-functional properties.
- [ ] The cost of using the interface.
- [x] The usage protocol, technology used, and semantics of the interface.

**Rationale:** The text provides a comprehensive list of properties needed for a well-defined interface: "the syntax, the data structures, the functional behavior and the behavior in the event of an error, the non-functional properties, the usage protocol for the interface, the technology used, all constraints and the semantics of the interface."

### Which of the following properties are necessary to make an interface "well-defined" according to the text?

- [x] The syntax and data structures
- [x] The functional behavior
- [x] The behavior in the event of an error
- [x] The non-functional properties
- [x] The usage protocol for the interface
- [x] The technology used
- [ ] The development cost
- [ ] The lead developer's name

**Rationale:** The text provides a comprehensive list of properties needed for a well-defined interface: "the syntax, the data structures, the functional behavior and the behavior in the event of an error, the non-functional properties, the usage protocol for the interface, the technology used, all constraints and the semantics of the interface." This format allows students to demonstrate understanding of each individual component.

### In which scenario is the interface specified by the importer, and the exporter must adapt to it?

- [ ] In most standard interface scenarios.
- [ ] When connecting to legacy systems.
- [x] In the case of frameworks or plugins.
- [ ] This scenario is not possible in software development.

**Rationale:** The text mentions, "In case of frameworks or plugins, you can also find the reverse case where the importer specifies the interface and the exporter has to adapt accordingly."

### What is the core principle of Postel's Law as it applies to interface development?

- [ ] Be strict in what you accept and flexible in what you send.
- [ ] Only accept data that perfectly matches the specification.
- [ ] Send as much data as possible, whether it was requested or not.
- [x] Be precise and correct in what your interface provides, but be flexible and tolerant in what it accepts from others.

**Rationale:** The text explains Postel's Law as: "Be conservative in what you do, be liberal in what you accept from others. More interfaces should therefore always do exactly what we promised in the interface description but we should never assume that the caller will actually fill in all the transfer parameters correctly and make the best of them."

### What is the role of a tool like Swagger in interface development?

- [ ] It automatically writes the implementation code for the interface.
- [ ] It is a type of adapter for connecting incompatible interfaces.
- [x] It helps describe interfaces in a structured way and can automatically generate and maintain API documentation.
- [ ] It is a framework for building user interfaces.

**Rationale:** The text states, "Swagger is an open-source tool that is widely used today to describe interfaces in a structured way. Swagger tools take over the tedious work of generating and maintaining your API documents and ensure that your documentation stays up to date as your API evolves."

### According to the text, which parties can implement interfaces?

- [x] The importer
- [x] The exporter
- [x] A third party
- [ ] Only the exporter
- [ ] Only the importer

**Rationale:** The text states: "Interfaces can be implemented by different parties, by the importer, the exporter or by a third party."

### In the context of old systems where the importer and exporter have fixed but diverged ideas about an interface, what is needed to connect these interfaces?

- [ ] A complete system redesign.
- [x] An adapter.
- [ ] A new communication protocol.
- [ ] A standardized consortium.

**Rationale:** The text explains: "With old systems, it can be observed that both the importer and the exporter has fixed ideas about the interface which may have fitted together in the past but have diverged over time. In this case, an adapter is needed to connect the interfaces."

### How does software architecture support project management, according to the text?

- [ ] By writing the project plan automatically.
- [ ] By eliminating the need for project managers.
- [x] By allowing project management to schedule the development of various components and plan tasks.
- [ ] By focusing solely on the technical implementation, leaving management to handle all planning.

**Rationale:** The text states, "...it becomes clear that project management can use the architecture to schedule the development of the various components listed in the architecture, for example to plan tasks."

### Which of the following are listed as benefits of software architecture in development projects?

- [x] It forms a bridge between analysis and realization by mapping requirements to structure.
- [ ] It makes the system more complex but also more robust.
- [x] It makes complexity manageable and understandable for various stakeholders.
- [ ] It guarantees that the project will be completed on time and within budget.
- [x] It forms the basis for the quality of a system, ensuring flexibility and expandability.

**Rationale:** The text lists several benefits: "Software architecture forms a bridge between analysis and realization by mapping requirements to structure... It makes complexity manageable and understandable for various stakeholders... And it forms the basis for the quality of a system and thus ensures flexibility and expandability."

### What does the analogy "software development is an expedition" illustrate?

- [ ] That software development is a linear process with a fixed goal from the start.
- [ ] That only the final solution matters, not the intermediate steps.
- [x] That an agile, iterative approach allows for adaptation and avoids costly late changes compared to a classical approach.
- [ ] That the initial plan for a project is always the most accurate one.

**Rationale:** The text describes an iterative process where each step refines the goal and reduces uncertainty, concluding that "Such late changes are much more expensive than the path via iterations with intermediate results."

### What are the primary, long-term quality characteristics that software architecture pursues?

- [ ] Rapid implementation of initial features.
- [ ] Pure functionality to meet immediate project goals.
- [x] Durability, maintainability, changeability, and extensibility.
- [ ] Minimizing the number of developers on a project.

**Rationale:** The text explicitly states, "Software architecture pursues the following quality characteristics. Durability, maintainability, changeability and extensibility as a contrast to pure functionality."

### Which of the following are primary, long-term quality characteristics that software architecture pursues?

- [x] Durability
- [x] Maintainability
- [x] Changeability
- [x] Extensibility
- [ ] Rapid implementation speed
- [ ] Cost minimization

**Rationale:** The text explicitly states, "Software architecture pursues the following quality characteristics. Durability, maintainability, changeability and extensibility as a contrast to pure functionality." This format allows learners to demonstrate understanding of each individual quality characteristic.

### How do the goals of software architecture typically contrast with general project goals?

- [ ] They are always perfectly aligned.
- [ ] Architectural goals are focused on immediate deliverables, while project goals are not.
- [ ] There is no significant difference between them.
- [x] Architectural goals are usually long-term (e.g., maintainability), while project goals are often short-term (e.g., implementing specific functionality).

**Rationale:** The text explains, "This means that the project goal of implementing a specific functionality differs significantly from the goal of the architecture. Architectural goals are usually long term, while project goals are often short term."

### How does software architecture guide the implementation phase of a project?

- [ ] By dictating the exact lines of code to be written.
- [ ] By replacing the need for programmers.
- [x] By providing architectural guidelines and rules that prevent chaotic implementation.
- [ ] By automatically generating all necessary code.

**Rationale:** The text states: "The implementation is guided by the architecture and the architecture rules defined therein. Without an architecture, the system would be implemented chaotically because the programmers lack the architectural guidelines."

### What is the significance of software architecture for quality assurance?

- [ ] It automates all testing processes.
- [x] It is of crucial importance for creating test plans and checking whether requirements have been met.
- [ ] It eliminates the need for manual quality checks.
- [ ] It only focuses on functional testing, ignoring non-functional aspects.

**Rationale:** The text mentions: "For quality assurance, the architecture is of crucial importance when it comes to creating test plans. The architecture can also be used to check whether the requirements have been met."

### Which of the following factors are mentioned as influencing the evolution of software architecture during the development process?

- [x] Changing requirements from customers.
- [x] Influencing factors from the environment and other project stakeholders.
- [x] The architect's evaluation and adaptation.
- [ ] Fixed and unchanging initial design documents.
- [ ] The marketing department's preferences.

**Rationale:** The text states: "First of all, there is the requirements which have an incisive influence on the first version of the architecture. But in the course of the development process, customers will discover new requirements and change old ones. The environment and other project stakeholders also have an influence on the architecture by changing influencing factors, which in turn influences the architecture. And the customers also change the influencing factors. Finally, the architect who evaluates and adapts the architecture completes the picture."

### According to the text, which of the following are primary tasks of a software architect?

- [x] Constructing and designing components, interfaces, and structures.
- [ ] Writing the majority of the production code.
- [x] Evaluating possible solutions and arguing for them in front of stakeholders.
- [ ] Managing the project's budget and daily schedule.
- [x] Documenting architectural decisions.
- [x] Simplifying the complexity of the software project.

**Rationale:** The text lists several tasks: "The software architect constructs and designs components, interfaces and structures... the architect constantly evaluates possible solutions... the architect has the task of documenting architectural decisions... And last but not least, the most important task of software architects is simplify."

### What is described as the "most important task" of a software architect in the provided text?

- [ ] To select the newest and most advanced technologies.
- [ ] To act as the primary contact for end-users.
- [x] To simplify everything possible to manage complexity.
- [ ] To create the most detailed and extensive documentation possible.

**Rationale:** The text explicitly states: "And last but not least, the most important task of software architects is simplify. The architect's talent for simplifying everything possible is crucial to the success of a project..."

### Which of these pairs represents a conflicting set of quality criteria that a software architect must balance?

- [ ] Performance and fault tolerance.
- [x] Introducing abstractions to increase flexibility versus maintaining comprehensibility.
- [ ] Meeting functional requirements and meeting non-functional requirements.
- [ ] Cost and timeframe.

**Rationale:** The text highlights this specific conflict: "...architecture is both easy to maintain because it is easy to understand but also contains enough flexibility for future adaptions. To increase flexibility, abstractions must be introduced that often make a system less comprehensible."

### What is the recommended relationship between an architect and the development team for the best cooperation?

- [ ] The architect should remain separate from the development team to maintain an objective view.
- [ ] The architect should only communicate with the team through the project manager.
- [x] The architect should feel like part of the team and be involved in the development, for example, as a programming architect.
- [ ] The architect provides the architecture upfront and has no further contact with the team.

**Rationale:** The text advises: "The best cooperation between the architect and the development team can be observed when the architect feels part of the team and is involved in the development, for example when he or she acts as a programming architect."

### Before developing a new system idea, what initial step should an architect take?

- [ ] Immediately start coding a prototype based on initial thoughts.
- [ ] Write a complete and final documentation of the proposed architecture.
- [x] Collect materials on how similar problems have been solved by others, using sources like past projects, technical literature, and design patterns.
- [ ] Poll the development team for their favorite technologies.

**Rationale:** The text recommends: "Before you develop your own system idea, you should collect materials on how other architects have solved similar problems. Examples of where you should find information are your own experience, other projects within the company, descriptions of similar systems in the Internet, technical literature and design patterns."

### What personal qualities are mentioned as necessary for a software architect to effectively manage their tasks and negotiate compromises?

- [ ] Strictness and inflexibility.
- [x] Diplomat and acrobat.
- [ ] Adventurousness and recklessness.
- [ ] Isolation and independence.

**Rationale:** The text states: "Software architects have to be diplomats and acrobats in order to juggle the many factors and negotiate compromises with stakeholders. They need a lot of courage for this, but must not become adventurous."

### With which project role does the architect primarily discuss functional and non-functional requirements at the start of a project?

- [ ] Quality Manager
- [x] Business Analyst
- [ ] Project Manager
- [ ] Users

**Rationale:** The text mentions: "At the start of the project, the architect talks very intensively with the business analyst about the functional and non-functional requirements."

### What is the architect's primary interaction with the Quality Manager?

- [ ] To receive new functional requirements.
- [x] To discuss the planned architecture and the test concept.
- [ ] To report on project progress.
- [ ] To communicate solutions and their costs to the customer.

**Rationale:** The text states: "With the quality manager, the architect discusses the planned architecture and the test concept developed by the quality manager."

### What is the basic process for clarifying requirements and influencing factors, as described in the text?

- [x] Collecting initial information.
- [x] Developing an initial idea for a solution.
- [x] Communicating the idea to various stakeholders.
- [x] Clarifying influencing factors and constraints through discussion.
- [x] Identifying and prioritizing quality characteristics.
- [ ] Immediately implementing the first solution idea without feedback.

**Rationale:** The text describes: "The basic process of clarifying the requirements and influencing factors begins with collecting information. Based on this first information, the architect develops an initial idea for a solution and communicates this idea to the various stakeholders. In the resulting discussion rounds, influencing factors and constraints can be clarified and risks for the current solution as well as the entire project can be explored. All these findings enable the architect to identify and gradually prioritize quality characteristics that are important for the solution."

### What caution is given regarding new ideas or solutions in software architecture?

- [ ] All new ideas are inherently ingenious and should be adopted immediately.
- [x] Have a deep mistrust of solutions whose basic features cannot be traced back to known things, as many new ideas are often the result of poor research.
- [ ] Only adopt solutions that are completely novel and have no historical precedent.
- [ ] New ideas should always be prioritized over established patterns.

**Rationale:** The text warns: "But be careful. Have a deep mistrust of solutions whose basic features cannot be traced back to known things you know. Many new ideas are not always ingenious but often the result of poor research by the inventors."

### What are the fundamental questions an architect should answer to develop an initial solution idea, as outlined in the text?

- [ ] What is the project budget and timeline?
- [x] What is the core task of the system and who uses it?
- [ ] What programming language and framework will be used?
- [x] What interfaces are there and how does the system manage data?
- [x] How is the system controlled?
- [ ] How large will the development team be?

**Rationale:** The text explicitly lists the key questions to guide the creative process: "What is the core task of the system? How is the system used? Who uses the system? What interfaces are there? How does the system manage data? How is the system controlled?"

### When identifying the users of a system, which of the following groups should an architect consider in addition to the users of the core functionality?

- [ ] The project sponsors.
- [x] Administrators and operators.
- [ ] The sales team.
- [x] Stakeholders who may have a negative attitude towards the new system.
- [x] Users of special functions like approvers or reviewers.

**Rationale:** The text advises looking beyond primary users: "There are users of the core functionality but also administrators and operators. It may be users of special functions like approvers, reviewers or evaluators. And ask yourself, which stakeholders have a negative attitude towards the new system?"

### Which of the following are described in the text as distinct types of system usage?

- [ ] A system used exclusively for internal training.
- [x] An interactive online system that supports normal business processes.
- [x] A background, offline, or batch system used for data manipulation.
- [ ] A system designed for social media integration.
- [x] An embedded system that works closely with specialized hardware.

**Rationale:** The text lists several usage types, including: "an interactive online system... a background system, offline or batch... an embedded system that works closely with specialized hardware."

### When an architect is considering how a system will manage its data, which of the following are influential aspects mentioned in the text?

- [ ] The physical location of the servers.
- [x] Data volume and license costs.
- [ ] The popularity of the database on social media.
- [x] Performance, parallel access, and data integrity.
- [x] Recoverability after system failures.

**Rationale:** The text provides a list of aspects that influence the choice of data management: "assistance and data volume, license costs and maintenance costs, performance and parallel access, expendability, data integrity, transaction support, language, security and the recoverability after system failures."

### What type of system control is described as being located *outside* the system, for example, at a module that receives keystrokes or mouse clicks?

- [ ] Procedural control
- [ ] Parallel control
- [x] Event-driven control
- [ ] Centralized control

**Rationale:** The text defines this specific control type: "With event-driven control, the control is located outside your system at the module that receives the keystrokes or mouse clicks. Your system is called from there."

### When describing the core task of a system, what is recommended?

- [ ] To list every single function the system will perform.
- [x] To describe it in two or three sentences, formulated positively, using core terms of the domain.
- [ ] To focus on the technical implementation details.
- [ ] To include all possible future enhancements.

**Rationale:** The text advises: "Describe the core task and responsibility of the system in two or three sentences. Formulate positively and use the core terms of the domain."

### What are some questions an architect should ask regarding user interfaces?

- [x] What type of user interfaces must the system provide?
- [x] Should the system be operated via console or command line, or special hardware?
- [x] Does the user interface need to be customizable for different user groups?
- [ ] What is the preferred color scheme for the user interface?
- [ ] How many developers are needed to build the user interface?

**Rationale:** The text lists these questions: "What type of user interfaces must the system provide? Are the users filling data into forms or do they have to do some other kind of work? Should the system be operated via console or command line or should some special hardware be used? Does the user interface need to be customizable for different user groups such as modes for amateurs, occasional users, experts, administrators? Or does each user group need its own interface?"

### What is the difference between procedural control and parallel control in a system?

- [ ] Procedural control involves multiple independent blocks, while parallel control is sequential.
- [x] Procedural control originates from a function block sequentially calling others, while parallel control involves several independent blocks reacting to events or requests.
- [ ] Procedural control is always external to the system, while parallel control is internal.
- [ ] There is no significant difference; they are interchangeable terms.

**Rationale:** The text defines: "If you have procedural control, the control originates from a function block in your system that sequentially calls other function blocks. In the case of parallel control, control is implemented by several independent blocks that react to events or requests independently of each other."

### What is the purpose of a "product box" as a communication tool in software architecture?

- [ ] To physically package the final software for shipment.
- [ ] To list all the developers who worked on the project.
- [x] To communicate the system idea in a compact way by answering questions about the product's name, purpose, main features, and selling points.
- [ ] To detail the technical specifications and infrastructure requirements.

**Rationale:** The text explains that the product box is a way to communicate the system idea and should contain answers to questions like: "What is the name of the product? What are we developing in one sentence? Who benefits from it and what is it good for? What are the main features of the system and what are the major selling points?"

### According to the text, what does the "package insert" complement the "product box" with?

- [ ] The marketing and sales strategy.
- [x] Information about particularly important quality characteristics or goals and the risks associated with the project.
- [ ] A list of all the technologies used in the project.
- [ ] The contact information for the development team.

**Rationale:** The text states, "And the package insert should say which quality characteristics or goals are particularly important and what risks are associated with the project."

### Which of the following are considered organizational influencing factors that can shape architectural design?

- [ ] The specific hardware that must be used.
- [x] How innovative the customer and stakeholders are.
- [ ] The continued use of legacy systems.
- [x] Development standards prescribed by the customer for the project.

**Rationale:** The text provides examples of organizational influencing factors: "how innovative the customer and stakeholders are or which development standards the customer prescribes for the project."

### What does the text suggest is an indicator of potential risks when communicating a system idea?

- [ ] When the development team asks too many questions.
- [ ] When the project has a tight schedule.
- [x] When you cannot describe certain aspects of the system precisely.
- [ ] When the customer has a lot of previous experience with software projects.

**Rationale:** The text explicitly notes, "Please note, if you cannot describe certain aspects of the system precisely, this is an indicator of potential risks."

### Which of the following is NOT listed as a typical risk in software projects?

- [ ] A tight schedule and limited availability of resources.
- [ ] Critical interfaces to external systems.
- [ ] Poorly set or changing requirements.
- [x] Having a very experienced and knowledgeable team.

**Rationale:** The text lists several typical risks, including "a tight schedule, limited availability of resources," "critical interfaces to external systems," and "poorly set requirements... and finally new or changing requirements." Having an experienced team is a benefit, not a risk.

### What is the initial step required before communicating the system idea to all stakeholders?

- [ ] Begin coding the system immediately.
- [ ] Conduct a full market analysis.
- [x] The system idea must be aligned with the customer and project management.
- [ ] Finalize all technical specifications.

**Rationale:** The text states: "Before the system idea can be communicated, the system idea must be aligned with the customer and the project management."

### Which of the following are examples of *technical* influencing factors that can shape architectural design?

- [ ] The level of innovation of the customer.
- [x] An existing base system.
- [x] A specific hardware that must be used.
- [x] The continued use of legacy systems.
- [ ] Development standards prescribed by the customer.

**Rationale:** The text provides examples of technical influencing factors: "Technical influencing factors include an existing base system or a specific hardware that must be used or the continued use of legacy systems to which interfaces must be implemented."

### What role does the architect's experience play in shaping architectural design?

- [ ] It is irrelevant, as each project is unique.
- [x] Experience from previous projects or knowledge of architectural styles shapes the architectural design.
- [ ] It only influences the choice of programming language.
- [ ] It primarily dictates the project timeline.

**Rationale:** The text states: "After all, the architect has experience from previous projects or because he knows certain architectural styles. These experience also shape the architectural design."

### What are some techniques mentioned for identifying important risks based on influencing factors?

- [x] Conducting brainstorming sessions with project stakeholders.
- [x] Discussing the list of specific influencing factors with members from other projects.
- [x] Aligning with the risk management of the project management.
- [x] Considering the interactions or mutual reinforcement of factors.
- [ ] Relying solely on automated risk assessment tools.

**Rationale:** The text suggests: "Conduct brainstorming sessions with project stakeholders. Discuss the list of your specific influencing factors with members from other projects. Align yourself to the risk management of the project management and consider the interactions or mutual reinforcement of factors, for example little experience with programming languages and no budget for trainings."

### What standard does the text recommend using to support the identification of quality characteristics in architectural design?

- [ ] ISO 9001
- [ ] The Agile Manifesto
- [x] DIN standard 25010
- [ ] The SOLID principles

**Rationale:** The text explicitly states, "We use the DIN standard 25010 to support us here. This standard describes eight attributes..."

### According to the text, which of the following are classified as "internal" quality attributes, which are particularly important for developers?

- [ ] Usability and Security
- [x] Maintainability and Portability
- [ ] Performance Efficiency and Reliability
- [ ] Functional Sustainability and Compatibility

**Rationale:** The text specifies, "The internal quality attributes such as maintainability and portability are particularly important for developers."

### Which of the following quality attributes are internal to the development process according to the text?

- [x] Maintainability
- [x] Portability
- [ ] Usability
- [ ] Security
- [ ] Performance Efficiency
- [ ] Reliability

**Rationale:** The text specifies, "The internal quality attributes such as maintainability and portability are particularly important for developers." This format allows students to identify each internal quality attribute individually rather than having to select them as a paired unit.

### For whom are the "external" quality attributes such as usability, performance, and security considered particularly important?

- [ ] Project managers
- [ ] The architects themselves
- [ ] The development team
- [x] The users

**Rationale:** The text makes a clear distinction: "The external quality attributes such as usability, performance, reliability, compatibility, security and functional sustainability are particularly important for users."

### How can an architect influence the *internal* quality attributes of a system?

- [ ] By choosing the right marketing strategy.
- [ ] Primarily through negotiating with users.
- [x] By using architectural styles that increase maintainability.
- [ ] By making decisions about which technology to use for external-facing features.

**Rationale:** The text explains, "For the internal quality attributes, the architect should use architectural styles that increase maintainability."

### How does an architect typically control the *external* quality attributes like performance and security?

- [ ] By writing detailed user manuals.
- [x] By making appropriate decisions about which technology to use.
- [ ] By focusing on the internal structure and code organization.
- [ ] By defining the team's communication protocols.

**Rationale:** The text states, "For the external quality attributes, the architect must make the appropriate decisions about which technology to use."

### What is the purpose of the characteristics that concretize the eight attributes described in DIN standard 25010?

- [ ] To define the programming languages to be used.
- [ ] To specify the project budget.
- [x] To describe and concretize the attributes.
- [ ] To outline the team's communication strategy.

**Rationale:** The text states: "These attributes are described and concretized by a series of characteristics."

### What are the two general approaches for developing software architectures discussed in the text?

- [ ] Agile and Waterfall
- [ ] Monolithic and Microservices
- [x] Top-down and Bottom-up
- [ ] Object-Oriented and Functional

**Rationale:** The text introduces the topic by stating, "At the beginning of this chapter we want to think in general terms about how software architectures can be developed, top-down or bottom-up."

### Which of the following is described as an advantage of the top-down approach?

- [ ] It guarantees easy technical integration at the end.
- [x] It leads to a better overall problem understanding because the problem is analyzed step by step.
- [ ] It provides very early feedback on whether the entire design is appropriate.
- [ ] It relies heavily on existing partial solutions from the start.

**Rationale:** The text lists as the first advantage: "First of all the top-down approach leads to a better overall problem understanding because the problem is analyzed step by step and greater depth."

### What is a significant disadvantage of the top-down approach?

- [ ] It achieves a high degree of reusability.
- [ ] The design is not visible in the final product.
- [x] Difficult technical integration at the end, as it's unknown if sub-problem solutions will fit together.
- [ ] It focuses too much on technical conditions from the beginning.

**Rationale:** One of the first disadvantages mentioned is "the difficult technical integration at the end. With the top-down approach the overall problem is broken down into parts without knowing whether the solutions to the sub-problems fit together."

### What is a key advantage of the bottom-up approach?

- [ ] It ensures the user's requirements are always the central focus.
- [ ] It prevents the integration of unnecessary partial solutions.
- [ ] It avoids the risk of premature solutions.
- [x] It achieves a high degree of reusability by starting with existing partial solutions.

**Rationale:** The text states, "By starting with existing partial solutions a high degree of reusability is achieved."

### How are the top-down and bottom-up approaches typically used in practice?

- [ ] They are mutually exclusive; a project must choose one or the other.
- [ ] The bottom-up approach is always preferred for all parts of a project.
- [x] They are usually combined; starting with a top-down approach but using a bottom-up solution for high-risk parts like interfaces.
- [ ] The top-down approach is used for development, and the bottom-up approach is used for testing.

**Rationale:** The text concludes, "In practice there is usually a combination of top-down and bottom-up approaches. Basically you try to start with a top-down approach. However risks are often seen in advance for example in external interfaces so that it is advisable to develop a bottom-up solution for the interfaces first in order to eliminate the risk."

### What is a key characteristic of the top-down approach regarding its independence from specific technologies?

- [ ] It is highly dependent on the chosen programming language from the start.
- [x] The analysis is independent of hardware and programming languages, especially at the beginning.
- [ ] It requires a specific operating system to function.
- [ ] It only works with open-source technologies.

**Rationale:** The text states: "This analysis is independent of hardware and programming languages especially at the beginning of the process."

### What is a potential pitfall of the top-down approach related to partial solutions?

- [ ] It always integrates all possible partial solutions.
- [x] It is possible that partial solutions are ignored because they are already covered by other partial solutions.
- [ ] It forces the creation of new partial solutions even when existing ones are available.
- [ ] It ensures that all partial solutions are perfectly aligned from the start.

**Rationale:** The text mentions: "It is also possible that partial solutions are ignored because partial problem is already covered by other partial solutions."

### What is an advantage of the bottom-up approach concerning user satisfaction?

- [ ] It guarantees that all user requirements are met from day one.
- [x] Incremental testing and step-by-step integration of partial solutions can achieve a high level of user satisfaction.
- [ ] It allows users to define the entire system architecture.
- [ ] It eliminates the need for user feedback.

**Rationale:** The text states: "Furthermore incremental testing and the step-by-step integration of partial solutions can achieve a high level of user satisfaction."

### What is a disadvantage of the bottom-up approach related to the focus on technical conditions?

- [ ] It ensures that user requirements are always the central focus.
- [x] The focus on technical conditions means that the user's requirements are no longer at the center of attention.
- [ ] It always leads to a perfect balance between technical and user needs.
- [ ] It prioritizes user experience over technical feasibility.

**Rationale:** The text states: "In addition the focus on technical conditions means that the user's requirements are no longer at the center of attention."

### What are the four levels of software architecture that structure the chapter described in the text?

- [ ] Requirements, Design, Implementation, and Testing.
- [x] Business Architecture, Architecture Style, Technical Architecture, and Cross-cutting Concerns.
- [ ] Top-down, Bottom-up, Iterative, and Agile.
- [ ] Data, Network, Security, and User Interface.

**Rationale:** The text outlines the structure for the chapter: "We will go through the different levels of software architecture... The process usually begins with the design of business architecture... How this is organized... is basically determined by software architecture styles... there are also two more technically oriented levels. The technical architecture... there are also the more technically driven cross-cutting concerns..."

### Which level of architecture is described as the "core" and is derived from business requirements to create domain models?

- [ ] The Technical Architecture
- [ ] The Architecture Style
- [x] The Business Architecture
- [ ] The Cross-cutting Concerns

**Rationale:** The text states, "The process usually begins with the design of business architecture, which can be derived from the business requirements. The aim here is to design domain models that consist of domain classes... The business architecture forms the core of the software architecture."

### From what are the two more technical architecture levels (Technical Architecture and Cross-cutting Concerns) primarily derived?

- [ ] The functional requirements.
- [ ] The business architecture directly.
- [x] The non-functional requirements.
- [ ] The user interface design.

**Rationale:** The text explains, "The two more technical architecture levels on the right are derived from the non-functional requirements."

### What does the "Technical Architecture" level define?

- [ ] The domain models and classes.
- [ ] The central architecture metaphor of the system.
- [x] The network parts and how the software is divided into deployment units.
- [ ] Concerns like persistence or communication protocols.

**Rationale:** The text specifies, "The technical architecture defines the network parts of the architecture and describes, for example, weather and how the software is divided into different deployment units."

### Although the overall process is iterative, what is suggested as a sensible starting point within an iteration?

- [ ] Defining the cross-cutting concerns like logging.
- [ ] Finalizing the technical architecture and deployment.
- [ ] Choosing an architectural style.
- [x] Starting with the business architecture.

**Rationale:** The text advises, "In general, a software architecture emerges in an iterative way, but usually the order of the different levels also form a sensible order within the iterations. For example, it is a good idea to start with a business architecture."

### What is the primary goal when designing the business architecture?

- [ ] To define the network infrastructure.
- [x] To design domain models that consist of domain classes.
- [ ] To select the programming language.
- [ ] To determine the communication protocols.

**Rationale:** The text states: "The process usually begins with the design of business architecture, which can be derived from the business requirements. The aim here is to design domain models that consist of domain classes."

### What is the role of the "Architecture Style" level in software architecture?

- [ ] It defines the specific database technology to be used.
- [x] It determines how the business architecture is organized with other building blocks and serves as the central architecture metaphor of the system.
- [ ] It focuses on the detailed implementation of individual components.
- [ ] It is primarily concerned with user interface design.

**Rationale:** The text explains: "How this is organized with other building blocks of the software is basically determined by software architecture styles. The architecture style is the central architecture meter 4 of the system."

### Which two levels of software architecture are described as being more "business-driven" and based on functional requirements?

- [ ] Technical Architecture and Cross-cutting Concerns.
- [x] Business Architecture and Architecture Style.
- [ ] Technical Architecture and Architecture Style.
- [ ] Business Architecture and Cross-cutting Concerns.

**Rationale:** The text states: "The two functional architecture levels on the left-hand side consist of application modules and their interrelationships, which are designed based on the functional requirements." These are the Business Architecture and Architecture Style.

### What is the relationship between the different levels of software architecture in the iterative process?

- [ ] They are completely independent and do not influence each other.
- [ ] Only the business architecture influences the other levels.
- [x] All levels influence each other in the iterative process.
- [ ] The technical levels are defined first, then the business levels.

**Rationale:** The text explicitly states: "Moreover, all levels influence each other in the iterative process."

### What is the typical starting point for creating a domain-specific model in software architecture?

- [ ] The technical requirements and constraints.
- [x] The domain artifacts from the real world, like documents or folders.
- [ ] The desired user interface layout.
- [ ] The existing database schema.

**Rationale:** The text states, "As anchored in the original idea of object-oriented analysis, we take the domain artifacts at the starting point for the domain model. In these images, for example, we see a depth map, a folder and a document. These are all good candidates for domain objects."

### In the implementation of a domain model, what does the behavior associated with a domain object (e.g., "add a contract to a folder") typically become?

- [ ] A separate utility library.
- [ ] A database stored procedure.
- [x] A method within the corresponding class (e.g., a method in the `CustomerFolder` class).
- [ ] A configuration file setting.

**Rationale:** The text explains, "In the implementation of the domain model, there would then be a customer folder class in which there is a method that can be used to insert a contract. All methods together form the interface of the class."

### What is the principle of "Command Query Separation"?

- [ ] Separating the user interface from the business logic.
- [ ] Separating synchronous calls from asynchronous calls.
- [ ] Separating database read operations from write operations at the database level.
- [x] Distinguishing between interactions that purely read information (queries) and interactions that change the object (commands).

**Rationale:** The text defines this principle: "We distinguish between two different types of interaction with the classes. These are the interactions that allow pure reading of information from the object and the interactions that change the object and perhaps trigger additional actions. The separation of these two interaction types is called command query separation."

### What is a primary benefit of applying Command Query Separation?

- [ ] It automatically improves the performance of all interactions.
- [x] It makes the use of read interactions more convenient because they can be called in any order without changing the system's state.
- [ ] It reduces the amount of code that needs to be written.
- [ ] It eliminates the need for error handling.

**Rationale:** The text highlights the benefit: "This makes the use of read interactions more convenient, as they can be called in any order without changing the semantics of the code."

### What is the key advice given for creating functional classes from the real world?

- [ ] To model only the data (nouns) and handle the actions separately.
- [ ] To create a single class for the entire domain.
- [x] To model the interactions (verbs) from the requirements along with the related objects (nouns), rather than modeling pure data.
- [ ] To ensure every class has a corresponding table in the database.

**Rationale:** The text advises, "When creating functional classes from the real world, do not model pure data. The domain-oriented model should always have as interfaces the interactions that emerge from the domain-oriented analysis along with the related objects."

### What is the relationship between domain objects and subject-specific classes in an object-oriented model?

- [ ] Domain objects are always separate from classes.
- [x] Domain objects later represent subject-specific classes.
- [ ] Classes are used to hide domain objects.
- [ ] There is no direct relationship.

**Rationale:** The text states: "For an object-oriented model, the objects later represent subject-specific classes."

### What is the key takeaway regarding modeling when creating functional classes from the real world?

- [ ] Focus solely on modeling the data (nouns).
- [x] Model the interactions (verbs) from the requirements along with the related objects (nouns), rather than modeling pure data.
- [ ] Ensure every class is a pure data holder with no methods.
- [ ] The domain model should only contain abstract concepts.

**Rationale:** The text advises: "When creating functional classes from the real world, do not model pure data. The domain-oriented model should always have as interfaces the interactions that emerge from the domain-oriented analysis along with the related objects. These are usually the verbs with the nouns that are formulated in the description of the requirements."

### What is the fundamental goal of "responsibility-driven design"?

- [ ] To ensure every developer is responsible for an equal amount of code.
- [x] To divide software into building blocks where each is assigned a single, clear responsibility.
- [ ] To create a document that lists who is responsible for each feature.
- [ ] To make building blocks as large and comprehensive as possible.

**Rationale:** The text states, "The aim is to divide up the responsibilities within a piece of software so that each building block is assigned one responsibility. This makes individual building blocks clearer and much easier to understand and to maintain."

### Which principle, introduced by David Parnas, states that modules should be as independent as possible and should not know how other modules are implemented?

- [ ] The Law of Demeter
- [ ] The Single Responsibility Principle
- [x] The Information-Hiding Principle
- [ ] The KISS Principle

**Rationale:** The text explains, "Parnas modularity principle means that a piece of software shall be structured into building blocks... such that the building blocks can be processed as independently of each other as possible. They should know as little as possible about each other's implementation. For this purpose, David Parnas introduced the so-called information-hiding principle."

### What is the defining characteristic of a "God class," which violates the principle of single responsibility?

- [ ] A class that is very small and has no dependencies.
- [ ] A class that is written by the lead architect.
- [x] A class that contains a vast majority of the source code and is responsible for almost everything.
- [ ] A class that can never be modified.

**Rationale:** The text describes this anti-pattern: "A well-known bad smell is the so-called God class, a class that contains approximately 90% of the source code and is responsible for almost everything. It is easy to see that this violates the principle of single responsibility."

### What is the primary benefit of the DRY (Don't Repeat Yourself) principle?

- [ ] It makes the initial development process faster by allowing code to be copied.
- [ ] It increases the total lines of code in a project.
- [ ] It ensures that every function is written by a different developer.
- [x] It creates a single point of truth and maintenance, which simplifies changes and corrections.

**Rationale:** The text states, "This means each responsibility is only implemented once such that we have a single point of truth and as a consequence, a single point of maintenance. If we duplicate code, then it complicates making changes..."

### What is the core message of the YAGNI (You Ain't Gonna Need It) principle?

- [ ] You should always implement the most complex solution possible.
- [x] You should not implement functionality based on speculation about future needs; only implement what is currently required.
- [ ] You should avoid using any third-party libraries.
- [ ] You should refactor code as soon as it is written.

**Rationale:** The text explains, "Often developers tend to implement more functionality than is needed because it might be needed in the future. However, if there are no requirements, we should not implement them. This corresponds to another principle called YAKNI, which stands for you ain't gone or needed."

### What does Parnas's Modularity Principle emphasize regarding building blocks?

- [ ] They should be tightly coupled.
- [x] They should be processed as independently of each other as possible.
- [ ] They should share all their internal implementations.
- [ ] They should only be used in monolithic architectures.

**Rationale:** The text states: "Parnas modularity principle means that a piece of software shall be structured into building blocks... such that the building blocks can be processed as independently of each other as possible."

### What is the main idea behind the "Separation of Concerns" principle?

- [ ] All concerns should be implemented in a single building block.
- [x] Different concerns, like user interaction or database handling, should be implemented in different building blocks.
- [ ] Concerns should only be separated at the architectural level, not in code.
- [ ] It is a principle that applies only to hardware design.

**Rationale:** The text states: "The different concerns, let's say user interaction or database handling, should be implemented in different building blocks."

### What does the Cohesion Principle of Miles, Code, and Jordan state about a module?

- [ ] It should have low cohesion between its elements.
- [x] It should have as much cohesion as possible between the elements of a building block.
- [ ] It should be responsible for multiple unrelated concerns.
- [ ] It should only interact with external modules.

**Rationale:** The text states: "The cohesion principle of Miles, Code and Jordan states that a module should have as much cohesion as possible between the elements of a building block."

### According to Robert Martin's Single Responsibility Principle, what should be the characteristic of each building block?

- [ ] It should be responsible for multiple functionalities.
- [x] It should only cover one responsibility, so that there can only ever be one reason why it needs to be changed.
- [ ] It should be changed frequently for various reasons.
- [ ] It should be designed to be unchangeable.

**Rationale:** The text states: "The single responsibility principle by Robert Martin states that each building block should only cover one responsibility, so that there can only ever be one reason why it needs to be changed."

### What is the core advice of the KISS (Keep It Simple, Stupid) principle?

- [ ] Always choose the most complex solution.
- [x] To keep things simple with appropriate complexity.
- [ ] To avoid any form of abstraction.
- [ ] To write code that is difficult to understand.

**Rationale:** The text states: "The KISS principle, which stands for keep it simple, stupid, is more of an advice to keep things simple with appropriate complexity."

### What is Kent Beck's advice for software development, as mentioned in the text?

- [ ] Make it complex, make it perfect, make it slow.
- [x] Make it work, make it right, make it fast.
- [ ] Make it simple, make it cheap, make it quick.
- [ ] Make it beautiful, make it scalable, make it secure.

**Rationale:** The text states: "We should strive for simplicity or, in the words of Kent Beck, make it work, make it right, make it fast."

### What is the core idea behind the Law of Demeter, also known as the principle of discretion?

- [ ] A client should know the detailed implementation of the services it calls.
- [ ] A service should expose its internal structure to give clients more control.
- [x] A service should not reveal *how* it is provided; a client should delegate completely and not orchestrate subsequent calls to other providers.
- [ ] A client should always talk to as many objects as possible to gather information.

**Rationale:** The text states, "The law of Demeter says that the service does not reveal how the service is provided via the interface... When a client delegates to a service, it should delegate completely. The client should not be responsible for orchestrating subsequent calls to other service providers. You might say, don't talk to a stranger."

### Why is the following code example considered a violation of the Law of Demeter? `get_student_record().get_exam_entry(semester)`

- [ ] Because it uses a method name that is too long.
- [x] Because the client traverses the internal object structure of the service provider, creating tight coupling.
- [ ] Because it passes a parameter to the second method call.
- [ ] Because it is a "fluent interface," which is always bad practice.

**Rationale:** The text explains this exact scenario: "In this implementation, the student service provider exposes the internal implementation of how the student records and XM entries are organized. The code traverses the object structures beneath the provider and is therefore tightly coupled to them. This is difficult to change and maintain."

### How does the improved implementation, which follows the Law of Demeter, differ from the violating one?

- [ ] It combines all objects into a single, large object.
- [ ] It removes all methods from the `Student` class.
- [x] The client delegates the entire operation to a single method in the `Student` class, which then orchestrates the internal calls itself.
- [ ] It makes the internal `record` and `exam_entry` objects public.

**Rationale:** The text describes the better implementation: "...here the client delegates completely and the student class provides a method that orchestrates the calls to the services of the sub-objects."

### In which situation is a fluent interface considered a good idea, according to the text?

- [ ] When you want to tightly couple a client to an implementation.
- [ ] For all methods, regardless of their complexity.
- [x] For methods with many parameters where the fluent interface can make the semantics of the parameters clearer, like constructing a date.
- [ ] When you need to expose the internal structure of a class.

**Rationale:** The text provides a specific use case: "For methods with many parameters, it is sometimes better to use a fluent interface to make the semantics of the parameter clear. In the second code, example below, we construct a date incrementally using with methods."

### What is the key difference between a good fluent interface (like the date constructor example) and one that violates the Law of Demeter?

- [ ] The good fluent interface uses longer method names.
- [x] The good fluent interface does not expose the internal implementation of the class, whereas the violating one does.
- [ ] The good fluent interface returns a new object, while the bad one modifies the existing object.
- [ ] There is no fundamental difference; all fluent interfaces violate the Law of Demeter.

**Rationale:** The text makes a crucial distinction about the acceptable fluent interface: "Note that this fluent interface does not expose the internal implementation of the class date."

### What is the relationship between a service provider and a client when delegation occurs?

- [ ] The service provider directly exposes its internal structure to the client.
- [x] The service provider can use other services to provide parts of its own service, acting as a client for those calls, while appearing as a single service to its own client.
- [ ] The client must orchestrate all subsequent calls to other service providers.
- [ ] Delegation is not permitted under the Law of Demeter.

**Rationale:** The text explains: "In turn, the provider, the former building block, of the service can potentially provide parts of its service by using other services provided by other service providers. This is called delegation. Look at the picture below. A client calls a service from the service provider in the middle, and that service provider in turn calls a service from a second service provider and is itself a client for that call. From the client on the far left it looks like a single service, and the client does not need to know that one part of the service is provided by a second service provider."

### What is the primary consequence of violating the Law of Demeter, as illustrated by the `get_student_record().get_exam_entry(semester)` example?

- [ ] It makes the code more readable.
- [x] It creates tight coupling between the client and the internal object structures of the service provider, making it difficult to change and maintain.
- [ ] It improves the performance of the system.
- [ ] It simplifies the testing process.

**Rationale:** The text states: "In this implementation, the student service provider exposes the internal implementation of how the student records and XM entries are organized. The code traverses the object structures beneath the provider and is therefore tightly coupled to them. This is difficult to change and maintain."

### What is the general rule for clients and service providers to follow the Law of Demeter?

- [ ] Clients should always know the internal structure of service providers.
- [x] A client should never delegate to the objects of an object, and the provider should never expose the structure underneath a service.
- [ ] Service providers should expose all their internal details.
- [ ] Clients should orchestrate all calls to sub-objects.

**Rationale:** The text summarizes: "In summary, a client should never delegate to the objects of an object and the provider should never expose the structure underneath a service."

### What are the primary benefits of achieving low coupling in a software design?

- [ ] It makes the software run faster and use less memory.
- [x] It makes the software easier to modify, analyze, test, and reuse.
- [ ] It reduces the number of classes required for the project.
- [ ] It ensures the project is completed ahead of schedule.

**Rationale:** The text explicitly states, "The benefits of low coupling are many. Software is easier to modify and analyze. Low coupling also makes it easier to test and reuse building blocks."

### What is the relationship between the size of a class (in lines of code) and its degree of coupling?

- [ ] Class size is unrelated to coupling.
- [ ] Smaller classes tend to have a higher degree of coupling.
- [x] Classes with a lot of lines of code tend to have more relationships with other classes and thus a higher degree of coupling.
- [ ] Classes of exactly equal size lead to the highest coupling.

**Rationale:** The text explains the observation from a study: "So classes that contain a lot of lines of code tend to have a lot of relationships with other classes and therefore have a high degree of coupling."

### What is a major drawback of having cyclic dependencies in a software architecture?

- [ ] They improve the performance of the system.
- [ ] They are a sign of a well-structured, object-oriented design.
- [x] They make it difficult to analyze the code, replace building blocks, and test components individually.
- [ ] They can only occur in very small projects.

**Rationale:** The text lists several drawbacks: "Cyclic dependencies make it difficult to find a good starting point for analyzing or understanding the code. Cycles also make it difficult to replace building blocks, and for testability this means that the cycles can only be tested as a whole."

### What is the recommended architectural structure to avoid the problems associated with cycles?

- [ ] A flat structure where all classes can interact with each other.
- [ ] A circular dependency graph.
- [ ] A procedural design with large "manager" classes.
- [x] A hierarchical structure.

**Rationale:** The text advises, "It is therefore important to design software with hierarchical structures and to avoid cycles."

### What tends to happen to cyclic dependency groups over time if they are not fixed?

- [ ] They usually resolve themselves as new code is added.
- [ ] They remain static and do not change in size or complexity.
- [x] They tend to grow and become even more tightly coupled as more classes are added to the cycle.
- [ ] They automatically break apart into smaller, independent components.

**Rationale:** The text warns, "Such cycle groups tend to grow and get even tighter coupled by adding additional classes to the cycle... As mentioned earlier, such cycle groups tend to grow."

### What is the definition of coupling in software design?

- [ ] The number of lines of code in a building block.
- [x] The degree to which a block depends on the blocks around it.
- [ ] The number of developers working on a specific module.
- [ ] The speed at which a software component executes.

**Rationale:** The text defines: "Coupling is the degree to which a block depends on the blocks around it."

### What is a "God class" and what design principle does it violate?

- [ ] A class that is responsible for a single, well-defined task; it violates the DRY principle.
- [x] A class that contains a vast majority of the source code and has too many responsibilities; it violates the single responsibility principle.
- [ ] A class that manages database connections; it violates the Law of Demeter.
- [ ] A class that is used for logging; it violates the principle of information hiding.

**Rationale:** The text states: "Very often such classes are so-called god classes, which have far too many responsibilities... It is easy to see that this violates the principle of single responsibility."

### What is the principle of acyclic dependencies, and why is it important?

- [ ] It states that all dependencies must be cyclic to ensure tight integration.
- [x] It states that dependencies should not form cycles, as cycles lead to strong coupling and make analysis, replacement, and testing difficult.
- [ ] It promotes the creation of large, monolithic applications.
- [ ] It is only relevant for very small, simple projects.

**Rationale:** The text explains: "Another characteristic for reducing coupling between classes is the principle of acyclic dependencies. Cyclic dependencies lead to strong coupling between the classes involved... Cyclic dependencies make it difficult to find a good starting point for analyzing or understanding the code. Cycles also make it difficult to replace building blocks, and for testability this means that the cycles can only be tested as a whole. It is therefore important to design software with hierarchical structures and to avoid cycles."

### What is the recommended solution for resolving a difficult cycle group with many direct and indirect interdependencies, as described in the text?

- [ ] Removing a single dependency.
- [x] A complete refactoring.
- [ ] Adding more classes to the cycle.
- [ ] Ignoring the cycle, as it will resolve itself.

**Rationale:** The text states: "In this example only a complete refactoring can resolve the cycle group."

### What are the three approaches for structuring business logic as defined by Martin Fowler in the text?

- [ ] Model-View-Controller, Layered Architecture, and Microservices.
- [x] Transaction Script, Table Module, and Domain Model.
- [ ] Procedural, Object-Oriented, and Functional.
- [ ] Data-centric, User-centric, and Service-centric.

**Rationale:** The text explicitly introduces the three approaches: "In the book, Patterns of Enterprise Application Architecture, Martin Fohler describes three approaches, the transaction script... the table module... and finally the domain model..."

### What is the central organizing principle of the "Transaction Script" approach?

- [ ] The business logic is organized into classes that mirror business objects.
- [ ] The business logic is structured around the tables in the database.
- [x] Each user transaction is handled by a dedicated procedure that contains all the necessary logic, from database access to UI updates.
- [ ] The business logic is completely separated from all technical code.

**Rationale:** The text explains, "As you can see from the architecture diagram on this slide, each user transaction is handled by a procedure in the program... The transaction results in a procedure being called, which handles everything including reading the database, business logic, and updating the user interface."

### Which of the following is a major disadvantage of the "Table Module" approach?

- [ ] It is a pure object-oriented model, which can be too complex for simple problems.
- [x] The business logic is inseparably fused with the technical database handling code, and changes to the database have an immediate impact.
- [ ] It is only suitable for very complex business logic.
- [ ] It requires a separate user interface for each database table.

**Rationale:** The text points out a key weakness: "In addition, the business logic is inseparably fused with the technical database handling code. This means that changes to the database have an immediate impact on the business logic."

### What is the key characteristic of the "Domain Model" approach?

- [ ] It is a procedural approach focused on simplicity.
- [ ] It is database-centric, with one class per table.
- [ ] It mixes business logic with user interface code for efficiency.
- [x] It is a proper object-oriented design where the domain logic is modeled independently of technical aspects like the database or UI.

**Rationale:** The text describes it as: "Here we find a proper object-oriented design that reflects the business objects of the business domain... The domain model is separated from any technical aspects, such as database handling or user interfaces."

### According to the comparison graph described in the text, how does the "Domain Model" approach compare to "Transaction Script" as business logic complexity increases?

- [ ] The Domain Model is always cheaper to maintain, regardless of complexity.
- [ ] The Transaction Script remains cheaper to maintain as complexity grows.
- [x] The Domain Model may be more costly for very simple logic, but its maintenance costs rise much slower, making it better for complex systems.
- [ ] Both approaches have identical maintenance cost curves.

**Rationale:** The text explains the graph: "In the beginning, the domain model is somewhat more difficult to maintain, but the more complex the business logic becomes, the more the advantages of a domain model become apparent. The system remains easy to expand and maintain."

### What is a key characteristic of the "Transaction Script" approach regarding the implementation of business logic?

- [ ] Business logic is always implemented only once.
- [x] Parts of the business logic may be implemented multiple times in different procedures.
- [ ] Business logic is strictly separated from database access.
- [ ] Business logic is organized into object-oriented classes.

**Rationale:** The text states: "Parts of the business logic may be implemented multiple times in different procedures."

### For what type of problems is the "Transaction Script" approach considered suitable?

- [ ] Highly complex enterprise applications.
- [x] Small programs or simple business logic.

**Rationale:** The text concludes: "In summary, the transaction script approach is only suitable for small programs or simple business logic."

### How does a "Table Module" organize domain logic?

- [ ] With one class per business object.
- [x] With one class per table in the database.
- [ ] With one procedure per user transaction.
- [ ] With a separate module for each business rule.

**Rationale:** The text states: "A table module organizes the domain logic with one class per table in the database."

### What is a key difference between a "Table Module" and a true object-oriented model?

- [ ] Table modules are object-oriented, while true object-oriented models are not.
- [x] In a table module, there is only one instance of the class that manages all entries of the table, unlike a true object-oriented model where there is one instance per record.
- [ ] Table modules separate business logic from database handling, while object-oriented models do not.
- [ ] Table modules are suitable for complex problems, while object-oriented models are not.

**Rationale:** The text explains: "Unlike a true object-oriented model, there is not one instance of the class per record, which corresponds to a business object."

### What object-oriented concepts are found in the "Domain Model" approach?

- [x] Encapsulation
- [x] Locality
- [x] Delegation
- [ ] Direct database access
- [ ] Procedural programming

**Rationale:** The text states: "In this model, we find many object-oriented concepts, such as encapsulation, locality and delegation."

### Why is it difficult to refactor a "Transaction Script" to a "Domain Model"?

- [ ] Because transaction scripts are always very small.
- [x] Because of the complexity of data sources and the fundamental difference in how business logic is structured.
- [ ] Because domain models are not object-oriented.
- [ ] Because refactoring tools do not support this transformation.

**Rationale:** The text states: "Due to the complexity of data sources, so no direct access to databases as with the other two approaches, it starts not as deep as the other two approaches. It is very difficult to refactor a transaction script to a domain model, so it is better to find the right solution at the very beginning."

### What are the three essential components of a CRC Card?

- [ ] Class name, Attributes, and Methods.
- [x] Class name, Responsibilities, and Collaborators.
- [ ] Component, Requirements, and Code.
- [ ] Card name, Rules, and Connections.

**Rationale:** The text explicitly states, "A CRC card consists of three parts – a class name, the responsibilities of the class and the collaborators of the class."

### In the context of CRC cards, what are "Collaborators"?

- [ ] The developers who are working on the class.
- [ ] The end-users who will interact with the system.
- [x] Other classes that are needed to help the current class fulfill its responsibilities.
- [ ] External third-party systems that the class integrates with.

**Rationale:** The text defines collaborators as: "The third part of CRC cards is the list of collaborators needed to fulfill the responsibilities. These are names of service providers. So that must be other classes to which the class can delegate partial responsibilities in order to provide its own service."

### According to the method described, how should a team identify initial candidates for classes?

- [ ] By looking for verbs in the requirements documents.
- [x] By looking for nouns in the domain description or requirements that could represent business objects.
- [ ] By analyzing the technical infrastructure.
- [ ] By brainstorming a list of all possible functions the system could perform.

**Rationale:** The text advises, "The class or component name is usually a term from the domain logic... So look for nouns in the software requirements that could embody business objects. These terms might be good candidates."

### What is the recommended group activity to validate and refine a CRC card model?

- [ ] To immediately start writing code for each card.
- [ ] To vote on the best card design without discussion.
- [x] To distribute the cards and play through use cases, discussing and adding responsibilities as needed.
- [ ] To convert the cards into a formal UML diagram before any validation.

**Rationale:** The text describes the process: "...distribute the cards among your group members and try to go through each use case. Ask the card holder if they can fulfill the responsibility for the requirements or not. Discuss in the group which card needs additional responsibilities and add them until you can play through the whole use case."

### Which of the following is considered a bad practice or "smell" to avoid when modeling with CRC cards?

- [ ] A class that has collaborators.
- [x] A class that has no responsibilities.
- [ ] A responsibility that is clearly related to the class it's on.
- [x] A class that has too many responsibilities.
- [ ] A class name that is a noun from the domain language.

**Rationale:** The text warns against several issues: "First, you should avoid classes with too many responsibilities... Do not model classes that have no responsibilities because they will not contribute to the model..."

### What is the primary purpose of the "Responsibilities" section on a CRC card?

- [ ] To list the technical methods of the class.
- [x] To characterize the services provided by the class, forming an offer to potential customers.
- [ ] To detail the internal data structures.
- [ ] To describe the class's dependencies on external libraries.

**Rationale:** The text states: "The responsibility part of a CRC card characterizes the services provided by the class. They form an offer to potential customers who can use the service to cover the business logic."

### How are "Collaborators" on a CRC card related to the responsibilities of a class?

- [ ] Collaborators are classes that have no responsibilities.
- [x] Collaborators are other classes to which the current class can delegate partial responsibilities to fulfill its own service.
- [ ] Collaborators are external systems that directly consume the class's services.
- [ ] Collaborators are the developers who implement the class.

**Rationale:** The text defines collaborators as: "The third part of CRC cards is the list of collaborators needed to fulfill the responsibilities. These are names of service providers. So that must be other classes to which the class can delegate partial responsibilities in order to provide its own service."

### What is the recommended approach for identifying responsibilities for CRC cards?

- [ ] Randomly assign responsibilities to classes.
- [x] Look at how actors interact with domain terms and write these interactions on the cards as responsibilities.
- [ ] Copy responsibilities from existing codebases.
- [ ] Only assign responsibilities that are easy to implement.

**Rationale:** The text advises: "Then look at how actors interact with these domain terms. What do they do with these things? You should write these interactions on the cards. These are good candidates for responsibilities."

### What is the general advice regarding censoring or refining CRC card models during the initial idea generation phase?

- [ ] Censor your work immediately to ensure perfection.
- [x] Don't censor your work too early; first generate ideas, then verify and refine later.
- [ ] Only generate ideas that are already perfect.
- [ ] Refine the model before generating any ideas.

**Rationale:** The text states: "Nevertheless, don't censor your work too early. First generate ideas, verify and refine later."

### What is an architectural style, as defined in the text?

- [ ] A specific programming language or framework used for a system.
- [x] A general solution structure that is uniformly applied to the entire system with almost no exceptions, acting as a set of global rules.
- [ ] A local design pattern applied to a single component.
- [ ] The visual design of the user interface.

**Rationale:** The text defines it as: "An architectural style is the general solution structure that is uniformly applied to the entire system with almost no exceptions. I like to say it's the set of rules that apply everywhere, from left to right, from top to bottom, not locally but globally."

### What is the central rule of a layered architecture?

- [ ] Layers can depend on any other layer, regardless of their position.
- [ ] Dependencies are only allowed from lower layers towards upper layers.
- [x] Only dependencies from upper layers towards lower layers are allowed.
- [ ] Layers must always be bypassed for performance reasons.

**Rationale:** The text states, "The important central rule of layered architecture is that only dependencies from upper layers towards lower layers are allowed."

### What does "strict layering" imply in a layered architecture?

- [ ] Layers can be bypassed if it improves performance.
- [x] Layers must not be bypassed or skipped; every layer may only access the layer directly beneath it.
- [ ] All layers must be implemented using the same technology.
- [ ] It means that the number of layers is fixed and cannot be changed.

**Rationale:** The text clarifies, "Strict layering implies that layers must not be bypassed or skipped. When using strict layering, every layer may only access the layer directly beneath it."

### What is a significant advantage of layered architecture, particularly concerning design erosion and cyclic dependencies?

- [ ] It eliminates the need for any form of documentation.
- [ ] It guarantees perfect application performance in all scenarios.
- [x] It dramatically reduces the risk of building huge dependency cycles and limits the "blast radius" of design erosion to a single cell.
- [ ] It allows for complete freedom in how components interact, without any rules.

**Rationale:** The text highlights this advantage: "The key advantage of layered architecture is its simplicity... With only very few rules, a two-dimensional layered architecture can already dramatically reduce the risk of building huge dependency cycles in your system... It limits the blast radius of design erosion and cyclic dependencies to that single cell of the matrix..."

### What is "layer bridging" in the context of layered architecture?

- [ ] A technique to combine multiple layers into a single, larger layer.
- [ ] A method for automatically generating code between layers.
- [x] A countermeasure to deficiencies of strict layering that explicitly allows layers to be skipped.
- [ ] A process for ensuring that all layers are equally sized.

**Rationale:** The text defines it as: "Nevertheless, the term layer bridging refers to the countermeasure for these deficiencies. It is the opposite of strict layering. It allows layers to be skipped, so if you want to explicitly allow access across a layer, layer bridging is the word for it."

### What is the primary characteristic of an architectural style regarding its application within a system?

- [ ] It applies only to specific, isolated components.
- [x] It is a general solution structure uniformly applied to the entire system with almost no exceptions, acting as a set of global rules.
- [ ] It is a suggestion that can be ignored if convenient.
- [ ] It is primarily concerned with the visual design of the user interface.

**Rationale:** The text defines it as: "An architectural style is the general solution structure that is uniformly applied to the entire system with almost no exceptions. I like to say it's the set of rules that apply everywhere, from left to right, from top to bottom, not locally but globally."

### What design heuristics and principles apply to layers in a layered architecture?

- [x] High cohesion.
- [x] Loose coupling.
- [x] Information hiding principle.
- [ ] Strict bypassing of layers.
- [ ] Unlimited dependencies between all layers.

**Rationale:** The text states: "The design heuristics of high cohesion and loose coupling, as well as the information hiding principle apply here as well. That means layers should have clear responsibilities and explicit interfaces."

### What is the purpose of a "second dimension" of layering in a layered architecture, and how is it typically arranged?

- [ ] To define technical concerns like presentation and infrastructure, arranged vertically.
- [x] To separate concerns from the business domain, arranged from left to right.
- [ ] To bypass strict layering rules, arranged randomly.
- [ ] To combine all layers into a single, monolithic structure.

**Rationale:** The text explains: "A second dimension should separate concerns from the business domain of the application... When visualizing such a second dimension, we usually arrange the layers from left to right, at least when working in a team that uses left to right in written language. The general rule remains the same. Higher layers on the left may only access lower layers on the right."

### What is a common disadvantage of layered architecture related to use cases and changes?

- [ ] It makes it impossible to add new features.
- [x] The propagation of almost every use case through multiple layers, and some requirements causing changes in multiple places (e.g., adding a field to a form).
- [ ] It always leads to performance bottlenecks.
- [ ] It requires all layers to be developed by the same team.

**Rationale:** The text discusses: "The propagation of almost every use case through multiple layers may in theory have a negative impact on application performance... More relevant is the issue that some requirements cause a lot of change in multiple places. The typical example is adding yet another field to a form. In this case, you need to make changes to your presentation layer. Probably change some data types in your application layer, add attributes to your core model classes, and likely you must add a column to some tables in your database."

### What is a common problem teams encounter with the standard four technical layers in a layered architecture?

- [ ] The presentation layer becomes too complex.
- [x] The infrastructure layer becomes a pool of various utilities used from everywhere.
- [ ] The business logic layer becomes too small.
- [ ] The application layer has too many responsibilities.

**Rationale:** The text states, "One typical problem teams encounter especially with these four standard layers that we use throughout the presentation is that the infrastructure layer becomes a pool of various utilities used from everywhere."

### What is a proposed solution to the problem of the infrastructure layer becoming a catch-all?

- [ ] Eliminate the infrastructure layer entirely.
- [ ] Move all infrastructure concerns to a separate microservice.
- [x] Move the infrastructure layer to the second dimension (domain layers) and place it at the bottom of the domain layers.
- [ ] Restrict access to the infrastructure layer to only one other layer.

**Rationale:** The text suggests, "a solution could be to move the infrastructure layer to the second dimension that we talked about and place it at the bottom of the domain layers."

### What was the consequence for a team that adopted Maven and had subsystems with cyclic dependencies?

- [ ] They were able to easily split all subsystems into separate Maven modules.
- [x] Some subsystems with cyclic dependencies could not be properly split and were lumped together in one very special module.
- [ ] Maven automatically resolved all cyclic dependencies.
- [ ] The team decided to abandon Maven due to the issue.

**Rationale:** The text describes the situation: "The reason was that some of these subsystems had cyclic dependencies and could not be properly split up into multiple Maven modules, so they were lumped together in one very special module."

### What is a crucial factor for the layers of a layered architecture to be truly helpful?

- [ ] The use of a specific programming language.
- [ ] The number of layers must be exactly four.
- [x] The code must be distributed somewhat evenly over the layers.
- [ ] All layers must be strictly layered without any bridging.

**Rationale:** The text emphasizes, "So remember the layers of your layered architecture will only be helpful if you manage to distribute your code somewhat evenly over the layers."

### What does the example of the Maven team illustrate about build systems that forbid cycles?

- [ ] They guarantee a well-structured system automatically.
- [ ] They are always sufficient to improve maintainability.
- [x] They are not a guarantee for a well-structured system if the code is not evenly distributed over the modules.
- [ ] They force developers to write less code.

**Rationale:** The text concludes, "And a build system that forbids cycles is not a guarantee for you to structure your system well because you must also achieve an even distribution over the modules in your build system."

### What are the four common technical layers typically found in a layered architecture, as mentioned in the text?

- [x] Presentation
- [x] Application Logic
- [x] Business Logic
- [x] Infrastructure
- [ ] Database
- [ ] Network

**Rationale:** The text refers to "these four standard layers that we use throughout the presentation" which are Presentation, Application Logic, Business Logic, and Infrastructure.

### When combining technical layering (vertical) and domain layering (horizontal), what is the general rule for dependencies?

- [ ] Any layer can depend on any other layer.
- [ ] Technical layers can only depend on other technical layers.
- [x] Dependencies are only allowed from upper layers towards lower layers (vertical) and from left to right (horizontal).
- [ ] Domain layers can only depend on other domain layers.

**Rationale:** The text describes the combination of vertical and horizontal layering, maintaining the rule: "The important central rule of layered architecture is that only dependencies from upper layers towards lower layers are allowed." and for the second dimension: "Higher layers on the left may only access lower layers on the right."

### What is meant by the "blast radius" of design erosion in a layered architecture?

- [ ] The total number of lines of code in the entire system.
- [x] The limited area within the architecture (e.g., a single cell in a matrix) where design problems and cyclic dependencies are contained.
- [ ] The speed at which design changes propagate through the system.
- [ ] The number of developers affected by a design flaw.

**Rationale:** The text states: "It limits the blast radius of design erosion and cyclic dependencies to that single cell of the matrix, so all the other cells can remain to be well-structured and maintainable."

### Is the propagation of a use case through multiple layers (e.g., adding a field to a form requiring changes in presentation, application, business, and infrastructure layers) considered a definite disadvantage of layered architecture?

- [ ] Yes, it always leads to significant performance issues.
- [ ] Yes, it means the architecture is too complex.
- [x] It is arguable; while it requires changes in multiple places, layers allow these steps to be performed independently and in any order.
- [ ] No, because it simplifies the initial development.

**Rationale:** The text discusses this point: "More relevant is the issue that some requirements cause a lot of change in multiple places... Whether that is really a disadvantage is, by the way, arguable. The layers allow you to perform these steps independently and in any order of your choice, which is a good thing."

### What is the primary characteristic of the "Pipes and Filters" architectural style?

- [ ] All functionality is contained within a single, monolithic component.
- [x] Functionality is encapsulated in independent "filters" connected by "pipes" that only handle data flow.
- [ ] It is primarily used for user interface design.
- [ ] Filters are tightly coupled and share internal state.

**Rationale:** The text describes it as: "The general principle is that all functionality is encapsulated in so-called filters. The filters are connected to each other via pipes. The pipes are dump. They are only responsible for turning the output of one filter into the input of the next filter."

### What is a key benefit of the Pipes and Filters architectural style, assuming compatible input/output formats?

- [ ] It eliminates the need for any data format definitions.
- [ ] It forces filters to be dependent on each other's internal implementation.
- [x] Filters can be combined arbitrarily without needing to change a single filter.
- [ ] It is only suitable for systems with a graphical user interface.

**Rationale:** The text states, "As long as these formats are compatible to each other, filters can be combined arbitrarily without the need to change a single filter."

### What is a common best practice emphasized for information systems with user interfaces, regarding component separation?

- [ ] To mix business rules and technical tasks for better integration.
- [ ] To put all logic into the user interface components.
- [x] To separate components that reflect business requirements (domain) from those that perform purely technical tasks.
- [ ] To avoid any form of component separation to simplify development.

**Rationale:** The text advises, "One key element of many architectural styles is the attempt to separate components that directly reflect business requirements in the domain the application is built for from components that merely perform technical tasks not related to business rules... We consider it a best practice to try to separate these two worlds."

### What is the core idea behind Hexagonal Architecture (Ports and Adapters)?

- [ ] To create a single, highly coupled component for all system logic.
- [ ] To use a specific database technology for all persistence.
- [x] A core implements business rules independent of technical infrastructure, with "adapters" added from the outside for technical integration.
- [ ] To ensure all dependencies flow from the technical layer to the business logic.

**Rationale:** The text explains, "The idea is very similar. A core implements business rules and requirements independent of technical infrastructure and adapters are added from the outside of this core and add technical integration like persistence, networking or user interface."

### How does Hexagonal Architecture relate to Layered Architecture, according to the text?

- [ ] They are completely unrelated and serve different purposes.
- [ ] Hexagonal architecture is a more complex version of strict layering.
- [x] If unfolded, Hexagonal Architecture can be seen as having two layers: a domain core with no dependencies, and adapters that use this core, similar to a two-dimensional layered architecture for different integration concerns.
- [ ] Hexagonal architecture is a direct replacement for all forms of layered architecture.

**Rationale:** The text clarifies, "Hexagonal architecture is not completely different from layered architecture. If you unfold the hexagon, you recognize we are talking about two layers, a domain core that has no dependencies and adapters that use this core. The adapters are isolated from one another and work independently, which looks like the second dimension of layered architecture from before."

### What is a potential drawback of the Pipes and Filters architectural style, despite its benefits?

- [ ] It requires filters to be tightly coupled.
- [x] Compatibility of input/output formats does not come for free and requires definition, implying a shared understanding or format.
- [ ] It is only suitable for systems with a single, simple function.
- [ ] It prevents the reuse of filters.

**Rationale:** The text states: "This compatibility, of course, does not come for free. You have to define these formats."

### What is the misleading aspect of the naming convention for "pipes" in frameworks like AngularJS, compared to the architectural style?

- [ ] In AngularJS, "pipes" are filters, and "filters" are pipes.
- [x] In the architectural style, the filter is the component performing actions and the pipe is infrastructure for data flow, whereas in AngularJS, the component holding processing logic is called a pipe.
- [ ] AngularJS pipes are only for data transformation, not for data flow.
- [ ] The architectural style's pipes are always synchronous, while AngularJS pipes are asynchronous.

**Rationale:** The text clarifies: "The naming here is, by the way, misleading because in the architectural style, the filter is the component performing the actions and the pipe is just the infrastructure for the data flow. AngularJS and Angular today call the component that holds the processing logic pipe."

### What is a key aspect of the architectural style called Quasar, regarding component classification?

- [ ] It classified all components into two categories: business and technical.
- [x] It classified all components into three categories: A (pure business logic), T (technical components), and R (converting from A to T and vice versa), with AT (mixed concerns) considered problematic.
- [ ] It only focused on classifying user interface components.
- [ ] It did not have any specific component classification.

**Rationale:** The text describes Quasar: "one key aspect of Quasar is explicit classification of all components into one of three categories. A, pure business logic and domain language. T, technical components for performing necessary tasks like storing objects in a database and R for converting from A to T and vice versa. The fourth category, AT, is considered problematic and to be avoided because it mixes domain and technical concerns."

### What was Alistair Cockburn's primary motivation for describing Hexagonal Architecture?

- [ ] To simplify database setup for all applications.
- [x] To be able to test the primary business logic of applications without having to set up a database.
- [ ] To create a new way to visualize layered architectures.
- [ ] To eliminate the need for adapters in software systems.

**Rationale:** The text states: "Alistair Coburn described this architecture because he wanted to be able to test the primary business logic of applications without having to set up a database."

### What are Onion Architecture and Clean Architecture considered to be, in relation to Hexagonal Architecture?

- [ ] Simpler, less elaborate versions.
- [x] Much more elaborate hexagonal architectures, providing more guidance on structuring the domain core.
- [ ] Completely different architectural styles with no commonalities.
- [ ] Outdated alternatives that are no longer relevant.

**Rationale:** The text states: "There are two very similar architectural styles called onion architecture, Geoffrey Palermo, and clean architecture, Bob Martin... You can consider them to be a much more elaborate hexagonal architecture. Both are based on books while Coburn's hexagonal architecture is just a short article. These two styles give much more guidance on structuring the domain core itself and they use other terminology like gateways instead of adapters."

### What is the primary purpose of a "pattern language" in software architecture?

- [ ] To define the user interface design guidelines.
- [ ] To specify the programming language to be used for a project.
- [x] To provide guidance on the detail level of code structure, even within architectural layers, to avoid chaos and cycles.
- [ ] To automate the entire software development process.

**Rationale:** The text asks, "So is it enough to just contain the blast radius of cycles? Or is there something we can do in our architectural style to give guidance also on the detail level? Of course, there is something we can do, and we call it a pattern language."

### In Domain-Driven Design (DDD), what is the key characteristic of an "Entity"?

- [ ] It is strictly immutable and has no identity.
- [x] It has an identity, can change (modifiable state), and is usually persistent.
- [ ] It performs procedures that cannot be implemented as methods of other objects.
- [ ] It is responsible for loading and storing objects from a database.

**Rationale:** The text defines an entity: "The central element of domain driven design is the entity. They are usually the key terms when describing processes and requirements. An entity is first and foremost an object that has an identity. Usually it can change so it has modifiable state and also most of the time entities are persistent."

### What is the main difference between an "Entity" and a "Value Object" in DDD?

- [ ] Entities are stateless, while Value Objects hold state.
- [x] Entities have an identity and can change, while Value Objects have no identity and are strictly immutable.
- [ ] Value Objects are always persistent, while Entities are not.
- [ ] Entities are used for technical concerns, and Value Objects for business logic.

**Rationale:** The text contrasts them: "The central element of domain driven design is the entity... An entity is first and foremost an object that has an identity... All information or data if you like in DDD is represented as value objects. These are objects that have no identity but purely represent values... Value objects are strictly immutable."

### What is the role of a "Service" in DDD tactical design building blocks?

- [ ] To store and load entities from a database.
- [x] To perform procedures that cannot be implemented as methods of entities or value objects, and they are strictly stateless.
- [ ] To encapsulate the complex instantiation process of entities.
- [ ] To represent the immutable identity of an entity.

**Rationale:** The text describes services: "Services are objects that perform procedures that cannot be implemented as methods of entities or value objects. For example tasks that involve multiple entities or require accessing a repository. Services are strictly stateless."

### What is an "Aggregate" in DDD, and what is its purpose?

- [ ] A collection of unrelated entities that are stored together.
- [ ] A type of service that handles complex business logic.
- [x] The smallest unit for storing and loading entities through a repository, always based on a root entity.
- [ ] A design pattern for creating new instances of objects.

**Rationale:** The text defines it: "The final concept is the aggregate. It is the smallest unit of storing and loading entities through a repository. An aggregate can be just a single entity or it can contain a whole bundle of entities. Either way an aggregate is always based on a root entity."

### What is the primary characteristic of a "Value Object" in Domain-Driven Design (DDD)?

- [ ] It has a unique identity and can be modified.
- [x] It has no identity, purely represents values, and is strictly immutable.
- [ ] It performs complex business logic that involves multiple entities.
- [ ] It is responsible for persisting entities to a database.

**Rationale:** The text states: "All information or data if you like in DDD is represented as value objects. These are objects that have no identity but purely represent values... Value objects are strictly immutable."

### What is the rule regarding state for "Services" in DDD?

- [ ] Services can hold any amount of state.
- [x] Services are strictly stateless.
- [ ] State is a privilege only granted to services.
- [ ] Services can only hold state if it's related to a single entity.

**Rationale:** The text states: "Services are strictly stateless. State is a privilege only granted to entities and value objects."

### What is the role of "Factories" in DDD tactical design building blocks?

- [ ] To perform business logic that cannot be implemented elsewhere.
- [x] To encapsulate the potentially complex instantiation process of entities or value objects.
- [ ] To persist entities to a database.
- [ ] To represent the immutable identity of an entity.

**Rationale:** The text states: "Factories are a pattern you probably know independent of domain driven design. These are special objects that encapsulate the potentially complex instantiation process of entities or value objects."

### What is the responsibility of "Repositories" in DDD?

- [ ] To define the business rules of the domain.
- [x] To persist entities, responsible for loading and storing an entity for use across transactions, and performing transformations for database storage.
- [ ] To handle user interface interactions.
- [ ] To manage the lifecycle of value objects.

**Rationale:** The text states: "Repositories are the means to persist entities. They are responsible for loading and storing an entity for use across transactions. This means they perform the transformation of the entity representation in memory to whatever is technically necessary to store them in a database for example."

### How does the pattern language of Domain-Driven Design (DDD) apply to a typical technical layered architecture?

- [ ] It replaces the need for layered architecture entirely.
- [ ] It applies only to the presentation layer.
- [x] It applies mostly to the domain layer of the layered architecture, helping to avoid cycles even within a layer.
- [ ] It dictates the specific technologies to be used in all layers.

**Rationale:** The text states: "The pattern language you just learned applies mostly to the domain layer of this layered architecture. Now you can augment your architectural style with a pattern language and avoid cycles even within a layer."

### For which part of a system are the tactical design building blocks of Domain-Driven Design (DDD) primarily suitable?

- [ ] The user interface layer.
- [ ] The technical infrastructure layer.
- [x] The domain layer or domain core.
- [ ] All parts of the system equally.

**Rationale:** The text states, "But the tactical design building blocks of DDD, domain-driven design, are effectively only suitable for the domain layer, or domain core in hexagonal architecture."

### What are the two key metaphors in the "Tools and Materials" approach to pattern languages?

- [ ] Inputs and Outputs.
- [ ] Clients and Servers.
- [x] Tools and Materials.
- [ ] Processes and Data.

**Rationale:** The text explicitly mentions, "As you can guess from the name, the two key metaphors are tools and materials."

### In the Tools and Materials approach, what does a "Tool" encapsulate?

- [ ] All the data structures of the system.
- [ ] The persistence logic for storing data.
- [x] All artifacts that provide a specific capability to the user, recognized as such by the user.
- [ ] The non-interactive background tasks.

**Rationale:** The text defines a tool: "It encapsulates all artifacts that provide a specific capability to the user. That means it's a tool that a user would recognize as such a tool."

### What is the distinction between "Tools" and "Automatons" in the Tools and Materials approach?

- [ ] Tools are for developers, and Automatons are for users.
- [ ] Tools are for interactive tasks, while Automatons are for non-interactive tasks.
- [x] Tools provide specific capabilities to the user interactively, while Automatons perform non-interactively for the user.
- [ ] Tools are for front-end, and Automatons are for back-end.

**Rationale:** The text differentiates them: "In addition to tools, the approach defines automatons for non-interactively performing tasks for the user. The distinction is important because the design of such components is entirely different from highly interactive tools."

### What are the three structural dimensions that an architectural style should ideally address, according to the rule of thumb provided?

- [ ] Performance, Security, and Scalability.
- [ ] Front-end, Back-end, and Database.
- [x] Domain modules, Technical hierarchy, and Pattern language.
- [ ] Requirements, Design, and Implementation.

**Rationale:** The text summarizes: "As a rule of thumb, your architectural style should address three structural dimensions. Domain modules... Technical hierarchy... And three, pattern language..."

### What is a potential drawback of the Pipes and Filters architectural style, despite its benefits?

- [ ] It requires filters to be tightly coupled.
- [x] Compatibility of input/output formats does not come for free and requires definition, implying a shared understanding or format.
- [ ] It is only suitable for systems with a single, simple function.
- [ ] It prevents the reuse of filters.

**Rationale:** The text states: "This compatibility, of course, does not come for free. You have to define these formats."

### What is the misleading aspect of the naming convention for "pipes" in frameworks like AngularJS, compared to the architectural style?

- [ ] In AngularJS, "pipes" are filters, and "filters" are pipes.
- [x] In the architectural style, the filter is the component performing actions and the pipe is infrastructure for data flow, whereas in AngularJS, the component holding processing logic is called a pipe.
- [ ] AngularJS pipes are only for data transformation, not for data flow.
- [ ] The architectural style's pipes are always synchronous, while AngularJS pipes are asynchronous.

**Rationale:** The text clarifies: "The naming here is, by the way, misleading because in the architectural style, the filter is the component performing the actions and the pipe is just the infrastructure for the data flow. AngularJS and Angular today call the component that holds the processing logic pipe."

### What is a key aspect of the architectural style called Quasar, regarding component classification?

- [ ] It classified all components into two categories: business and technical.
- [x] It classified all components into three categories: A (pure business logic), T (technical components), and R (converting from A to T and vice versa), with AT (mixed concerns) considered problematic.
- [ ] It only focused on classifying user interface components.
- [ ] It did not have any specific component classification.

**Rationale:** The text describes Quasar: "one key aspect of Quasar is explicit classification of all components into one of three categories. A, pure business logic and domain language. T, technical components for performing necessary tasks like storing objects in a database and R for converting from A to T and vice versa. The fourth category, AT, is considered problematic and to be avoided because it mixes domain and technical concerns."

### What was Alistair Cockburn's primary motivation for describing Hexagonal Architecture?

- [ ] To simplify database setup for all applications.
- [x] To be able to test the primary business logic of applications without having to set up a database.
- [ ] To create a new way to visualize layered architectures.
- [ ] To eliminate the need for adapters in software systems.

**Rationale:** The text states: "Alistair Coburn described this architecture because he wanted to be able to test the primary business logic of applications without having to set up a database."

### What are Onion Architecture and Clean Architecture considered to be, in relation to Hexagonal Architecture?

- [ ] Simpler, less elaborate versions.
- [x] Much more elaborate hexagonal architectures, providing more guidance on structuring the domain core.
- [ ] Completely different architectural styles with no commonalities.
- [ ] Outdated alternatives that are no longer relevant.

**Rationale:** The text states: "There are two very similar architectural styles called onion architecture, Geoffrey Palermo, and clean architecture, Bob Martin... You can consider them to be a much more elaborate hexagonal architecture. Both are based on books while Coburn's hexagonal architecture is just a short article. These two styles give much more guidance on structuring the domain core itself and they use other terminology like gateways instead of adapters."

### What is Conway's Law, as described in the text?

- [ ] A law stating that software systems must always have a layered architecture.
- [x] A statement that the communication structure of an organization will always be visible in the structure of what that organization produces.
- [ ] A principle that dictates the optimal size of a development team.
- [ ] A rule that mandates the use of specific programming languages for certain tasks.

**Rationale:** The text defines Conway's Law: "It's a statement from a paper written by Melvin Conway in 1967. And it basically says that the communication structure of an organization will always be visible in the structure of whatever that organization produces."

### If development teams are assigned to build specific layers (e.g., UI team, business logic team), what does Conway's Law predict will happen to the building blocks?

- [ ] Building blocks will become completely independent of each other.
- [x] Building blocks within teams will increase their coupling, while separation across teams will become more coarse-grained and stricter.
- [ ] All interfaces between layers will be perfectly clear and well-tested.
- [ ] The system will naturally evolve into a microservices architecture.

**Rationale:** The text explains: "Conway's Law predicts that this will lead to some building blocks increasing their coupling and less clear separation within the teams and more coarse-grained and stricter separation of components across teams."

### What is the effect of assigning teams to features or specific parts of the domain, according to Conway's Law?

- [ ] Teams will become isolated and unable to collaborate.
- [x] Boundaries within a team will fade, while strong boundaries will be established between teams, potentially leading to splitting building blocks for independent work.
- [ ] This approach will always result in a system structure that perfectly matches the initial design.
- [ ] It will lead to a decrease in the overall number of building blocks.

**Rationale:** The text describes this effect: "The effect according to Conway's Law is the same. Within a team, boundaries will start to fade. In between teams, teams will establish strong boundaries. In this example, they will effectively split building blocks so that they can work independently."

### What is the ultimate implication of Conway's Law for system design, regardless of the initial design?

- [ ] The initial theoretical design will always dictate the final system structure.
- [ ] The system structure is entirely independent of the team structure.
- [x] The team structure will always be stronger than any theoretical design of your system.
- [ ] Software architecture is irrelevant if the team structure is well-defined.

**Rationale:** The text emphasizes: "No matter what you do, the team structure will always be stronger than any theoretical design of your system."

### What is a characteristic of "highly standardized teams" (component teams)?

- [ ] They are very agile and can deliver valuable features at high speed.
- [x] They can specialize on certain skills and build very clever and efficient solutions, but are dependent on other teams for valuable functionality.
- [ ] They must master all technical skills for their domain.
- [ ] They are primarily focused on delivering end-to-end features independently.

**Rationale:** The text describes them: "Highly standardized teams, which would be closer to the component teams we saw, they can specialize on certain skills and build very clever and efficient solutions. But they are very dependent on other teams to create valuable functionality for users."

### In what year was Conway's Law formulated?

- [ ] 1985
- [ ] 2001
- [x] 1967
- [ ] 1992

**Rationale:** The text states: "It's a statement from a paper written by Melvin Conway in 1967."

### What is the advice derived from Conway's Law for building a system with a certain structure?

- [ ] The team structure should be ignored, and only the technical design matters.
- [x] You must organize your teams in a way that reflects that desired structure.
- [ ] The system structure will automatically emerge regardless of team organization.
- [ ] Only very small teams can achieve a specific system structure.

**Rationale:** The text implies: "If you want to build a system with a certain structure, you must organize your teams in a way that reflects that structure."

### What are the characteristics of "feature teams" (as opposed to component teams)?

- [ ] They specialize in specific technical skills and build very efficient solutions.
- [x] They must master all technical skills for their domain.
- [x] They can deliver valuable features at high speed.
- [ ] They are not very efficient in building very clever and efficient solutions.
- [ ] They are primarily focused on building reusable components.

**Rationale:** The text describes feature teams: "The opposite of component teams are so-called feature teams. Feature teams must master all technical skills for their domain... Feature teams can deliver valuable features at high speed. But they are not very efficient in building very clever and efficient solutions."

### According to the text, what is the core definition of microservices?

- [ ] An application developed by a single, small team.
- [x] An application split into multiple independently deployed technical services that cooperate to deliver overall functionality.
- [ ] A system where all components share a single, centralized database.
- [ ] A software development methodology focused on rapid prototyping.

**Rationale:** The text defines microservices as: "Microservices means an application is split into multiple independently deployed technical services that cooperate to deliver the overall functionality."

### What is considered the most important trait of microservices, according to the text?

- [ ] Their ability to scale independently.
- [x] Their autonomy, meaning individual services are deployed independently and are decoupled in various aspects.
- [ ] Their use of a single, consistent technology stack.
- [ ] Their strict adherence to a single architectural style.

**Rationale:** The text states, "The fact that they can also scale independently is really not their most important trait. Microservices are about autonomy."

### Which aspects demonstrate microservice autonomy? (Select all that apply)

- [x] Independent deployment capability
- [x] Decoupling in various technical aspects
- [x] Freedom from direct coupling to other services
- [ ] Shared database usage
- [ ] Synchronized deployment schedules
- [ ] Identical technology stacks

**Rationale:** The text states that microservices "are about autonomy" and describes how "individual services are deployed independently and are decoupled in various aspects." This format allows students to demonstrate understanding of each individual aspect of autonomy.

### How do microservices relate to the concept of two-dimensionally layered architecture?

- [ ] Microservices completely replace layered architecture, making it obsolete.
- [ ] Microservices only focus on technical layers, ignoring domain modules.
- [x] With microservices, domain modules become the leading dimension, forming the top-level hierarchy of independently deployed services, while technical layers are secondary within each service.
- [ ] Each microservice must strictly adhere to the same technical layering as all other microservices.

**Rationale:** The text explains, "With microservices, the domain modules finally become the leading dimension. They form the top-level hierarchy of the system and constitute the independently deployed services. The technical layers are a secondary structure within the services, which may or may not be consistent across services."

### In microservice architecture, which architectural dimensions have the following characteristics?

- [x] Domain modules form the top-level hierarchy
- [x] Domain modules constitute independently deployed services
- [x] Technical layers are secondary within each service
- [x] Technical layers may vary between different services
- [ ] Technical layers must be identical across all services
- [ ] Domain modules are secondary to technical organization

**Rationale:** The text explains, "With microservices, the domain modules finally become the leading dimension. They form the top-level hierarchy of the system and constitute the independently deployed services. The technical layers are a secondary structure within the services, which may or may not be consistent across services." This format allows assessment of understanding of each architectural dimension characteristic.

### What principle, also relevant in non-distributed architectures, applies to dependencies between microservices?

- [ ] The principle of strong coupling.
- [ ] The principle of shared databases.
- [x] The acyclic dependency principle.
- [ ] The principle of centralized control.

**Rationale:** The text emphasizes, "Microservices must also not arbitrarily depend on each other. The acyclic dependency principle is just as relevant here as it is in non-distributed architectural styles."

### What is a common pitfall for organizations regarding dependencies in microservice architectures?

- [ ] They make dependencies too visible, leading to over-optimization.
- [ ] They assume that dependencies are automatically managed by the microservice framework.
- [x] They underestimate the impact of dependencies, which, though less visible than in monoliths, still affect change propagation and coupling.
- [ ] They focus too much on organizing dependencies into a manageable hierarchy.

**Rationale:** The text warns, "This is a common pit for many organizations have fallen into. Although dependencies in microservice architectures are not as easily visible as in a single monolithic codebase, they are still dependencies with all their effects on change propagation and coupling."

### Which statements about dependencies in microservice architectures are true? (Select all that apply)

- [x] Dependencies are less visible than in monolithic systems
- [x] Dependencies still impact change propagation
- [x] Dependencies continue to affect system coupling
- [x] Organizations often underestimate dependency management complexity
- [ ] Dependencies are automatically managed by microservice frameworks
- [ ] Dependencies become irrelevant in distributed systems

**Rationale:** The text warns, "This is a common pit for many organizations have fallen into. Although dependencies in microservice architectures are not as easily visible as in a single monolithic codebase, they are still dependencies with all their effects on change propagation and coupling." This format allows testing understanding of each individual aspect of the dependency challenge.

### What is the primary benefit of microservices regarding independent scaling?

- [ ] It is the most important trait of microservices.
- [x] While possible, it is not their most important trait; autonomy is.
- [ ] It is only possible if all microservices use the same technology.
- [ ] It is a feature that is rarely used in practice.

**Rationale:** The text states: "The fact that they can also scale independently is really not their most important trait. Microservices are about autonomy."

### What is the relationship between microservices and the "single responsibility principle"?

- [ ] Microservices are designed to violate the single responsibility principle.
- [x] Each microservice should ideally adhere to the single responsibility principle, focusing on a single business capability.
- [ ] The single responsibility principle is irrelevant in microservice architectures.
- [ ] Microservices combine multiple responsibilities into one service.

**Rationale:** While not explicitly stated as "single responsibility principle," the text implies it by stating "domain modules finally become the leading dimension. They form the top-level hierarchy of the system and constitute the independently deployed services." This aligns with the idea of a service having a single, well-defined business capability.

### What is the key distinction between a "design pattern" and a "pattern language"?

- [ ] Design patterns are only for object-oriented programming, while pattern languages are for all paradigms.
- [ ] A design pattern is a broad, system-wide rule, while a pattern language is applied locally.
- [x] A design pattern describes a recurring problem and a proven local solution, while a pattern language is a set of rules applied uniformly and broadly across a system.
- [ ] Design patterns are theoretical, while pattern languages are practical implementations.

**Rationale:** The text clarifies: "A pattern language is something you apply broadly as part of your architectural style. A design pattern is applied when needed locally, maybe only in one place."

### What happens if a certain design pattern is consistently used for a specific problem class within a system?

- [ ] It becomes obsolete and should be replaced.
- [ ] It loses its effectiveness and should be avoided.
- [x] It becomes part of the system's pattern language and therefore its architectural style.
- [ ] It indicates a lack of creativity in the design process.

**Rationale:** The text states: "However, if you decide that a certain design pattern must always be used for a certain problem class in your system, it becomes a part of your pattern language and therefore your architectural style."

### What is the primary purpose of the "Strategy Pattern"?

- [ ] To hide the details of remote calls.
- [ ] To extend functionality in an elegant and safe way.
- [x] To allow for the dynamic verification and exchange of an algorithm used for a certain computation.
- [ ] To streamline communication between distributed components.

**Rationale:** The text describes it: "The strategy pattern is about verifying an algorithm used for a certain computation dynamically. The pattern forces you to isolate and encapsulate the exchangeable algorithm from its use site and then allows to have multiple implementations."

### What is a key characteristic of a good design pattern, as exemplified by the Strategy Pattern?

- [ ] It must always involve a complex inheritance hierarchy.
- [ ] It should only be applicable to a single programming language.
- [x] It should come with a description of a standardized arrangement, often a UML diagram, and define abstract interfaces.
- [ ] It should make the context aware of the specific implementations of the algorithm.

**Rationale:** The text notes: "As you see, a good design pattern should come with a description of a standardized arrangement, usually a UML diagram or something similar. The key is to define the abstract strategy interface so that multiple implementations become possible and the context that is the client of the strategy does not know them."

### What is the main goal of the "Broker Pattern"?

- [ ] To ensure all components are co-located on the same server.
- [ ] To replace all direct communication between components with a centralized message queue.
- [x] To streamline the communication of distributed components, making it irrelevant whether a component is co-located or distributed.
- [ ] To provide a graphical user interface for managing distributed systems.

**Rationale:** The text explains: "Another pattern you should at least have heard of is the broker pattern. It is a means to streamline the communication of distributed components. It aims at making it irrelevant whether a component is co-located to another or distributed and somewhere else on the network."

### What is the primary purpose of design patterns?

- [ ] To create new programming languages.
- [x] To describe a recurring problem and a proven local solution.
- [ ] To enforce a specific architectural style globally.
- [ ] To automate code generation.

**Rationale:** The text implies this by contrasting it with pattern languages: "A design pattern is applied when needed locally, maybe only in one place." and the general understanding of design patterns.

### What is the key benefit of the Strategy Pattern regarding the client (context)?

- [ ] The client must know all implementations of the algorithm.
- [x] The client does not need to know the specific implementations of the algorithm, only the abstract interface.
- [ ] The client is responsible for creating new algorithm implementations.
- [ ] The client directly modifies the algorithm's internal logic.

**Rationale:** The text states: "The key is to define the abstract strategy interface so that multiple implementations become possible and the context that is the client of the strategy does not know them."

### What is the main advantage of using the Broker Pattern in distributed systems?

- [ ] It eliminates the need for network communication.
- [x] It makes the location of components irrelevant to their communication.
- [ ] It forces all components to be written in the same programming language.
- [ ] It centralizes all business logic in one place.

**Rationale:** The text explains: "It aims at making it irrelevant whether a component is co-located to another or distributed and somewhere else on the network."

### What is the primary purpose of the SOLID principles, despite debates about their classification as "principles"?

- [ ] To provide strict, formal rules for software development that must never be broken.
- [ ] To dictate the exact programming language and framework to be used.
- [x] To serve as heuristics and thought-provoking challenges for improving the maintainability and quality of software designs.
- [ ] To ensure that all software is developed by a single, large team.

**Rationale:** The text states, "Nevertheless, as heuristics and thought-provoking challenges to our designs, they still serve us very well, and you should know them."

### What is a practical interpretation of the Single Responsibility Principle (SRP) suggested in the text?

- [ ] A class must have only one method.
- [ ] A class should never change for any reason.
- [x] A building block's purpose can be explained in one short sentence without using the word "and."
- [ ] A building block should be responsible for all aspects of a feature.

**Rationale:** The text offers this interpretation: "I like to break it down to, can you explain the purpose of a building block in one short sentence without using the word end? If you can, you're probably fine with the single responsibility principle."

### What does the Open-Closed Principle (OCP) propose for designing building blocks?

- [ ] They should be open for modification and closed for extension.
- [ ] They should be open for both modification and extension.
- [x] They should be closed for modification but open for extension from the outside.
- [ ] They should be completely closed to any changes once implemented.

**Rationale:** The text explains, "It proposes to design building blocks so that they are not to be modified, closed for modification, but the behavior to be extended from the outside, open for extension."

### What is the core requirement of the Liskov Substitution Principle (LSP)?

- [ ] Subclasses must always be smaller than their superclass.
- [ ] Subclasses must always override all methods of their superclass.
- [x] Subclasses must always be valid replacements for their superclass, meaning they can be used interchangeably without breaking existing code.
- [ ] Subclasses should introduce new behavior that is completely unrelated to the superclass.

**Rationale:** The text states, "It requires us to guarantee that subclasses must always be valid replacements for their superclass."

### What is the main idea behind the Interface Segregation Principle (ISP)?

- [ ] Interfaces should be as broad as possible to serve many clients.
- [ ] Interfaces should only contain methods that are implemented by all clients.
- [x] It is beneficial to expose smaller, client-specific interfaces rather than a single, broad interface with many functions.
- [ ] Interfaces should be hidden from clients to reduce coupling.

**Rationale:** The text suggests, "It suggests that it may become a problem to expose a broad interface with many functions to many different clients... When exposing smaller interfaces to specific groups of similar clients, a change to one function will cause much less friction and unnecessary verification efforts."

### What does the "S" in SOLID stand for?

- [ ] Scalability
- [x] Single Responsibility Principle
- [ ] Security
- [ ] Simplicity

**Rationale:** The text introduces the SOLID principles and then discusses each one, starting with the Single Responsibility Principle.

### What does the "O" in SOLID stand for?

- [ ] Object-Oriented
- [x] Open-Closed Principle
- [ ] Optimization
- [ ] Operations

**Rationale:** The text introduces the SOLID principles and then discusses each one, including the Open-Closed Principle.

### What does the "L" in SOLID stand for?

- [ ] Layering
- [x] Liskov Substitution Principle
- [ ] Logging
- [ ] Loose Coupling

**Rationale:** The text introduces the SOLID principles and then discusses each one, including the Liskov Substitution Principle.

### What does the "I" in SOLID stand for?

- [ ] Inheritance
- [x] Interface Segregation Principle
- [ ] Integration
- [ ] Immutability

**Rationale:** The text introduces the SOLID principles and then discusses each one, including the Interface Segregation Principle.

### What does the "D" in SOLID stand for?

- [ ] Delegation
- [x] Dependency Inversion Principle
- [ ] Documentation
- [ ] Data Modeling

**Rationale:** The text introduces the SOLID principles and then discusses each one, including the Dependency Inversion Principle.

### What is the Dependency Inversion Principle (DIP) primarily described as?

- [ ] A strict rule that must always be followed in all software designs.
- [x] A technique or tool to be known and applied when needed, enabling other design patterns and principles.
- [ ] A method for reducing the number of classes in a system.
- [ ] A way to eliminate all dependencies between software components.

**Rationale:** The text states, "The dependency inversion principle is less of a rule to apply, but better described as a technique that should be known in order to apply it when needed. It is a key tool to making a lot of the things happen we talked about."

### In the context of DIP, what is being "inverted"?

- [ ] The order of execution of functions.
- [ ] The direction of data flow within a system.
- [x] The dependency arrow between a high-level policy and a detail function, by introducing an abstraction that both depend on.
- [ ] The responsibility for error handling.

**Rationale:** The text explains, "With dependency inversion, we introduce an abstraction that is a pure description of the interface of the detail, its contract if you like. And then we have the high-level policy call that abstract declaration without referencing the concrete implementation itself... Now this is the dependency arrow that inverts the dependency from before. It points against the control flow."

### What is one of the two practical incarnations of the Dependency Inversion Principle mentioned in the text?

- [ ] Aspect-Oriented Programming (AOP).
- [x] Inversion of Control (IoC), also known as the Hollywood principle.
- [ ] Test-Driven Development (TDD).
- [ ] Domain-Driven Design (DDD).

**Rationale:** The text states, "The dependency inversion principle has two practical incarnations. One of them is the paradigm of inversion of control, or IOC, sometimes called the Hollywood principle."

### What is the primary benefit of using "Constructor Injection" for dependency injection?

- [ ] It allows for dependencies to be set at any time after object creation.
- [ ] It is the only method that supports field injection.
- [x] It guarantees that components will have their dependencies set at the moment of construction, making it harder to accidentally not provide them.
- [ ] It eliminates the need for any external frameworks.

**Rationale:** The text explains, "This is why constructor injection has become the leading paradigm for dependency injection. It means dependencies are directly injected at the moment of the construction of an object through the constructor. The benefit is that now there is actually no easy way to accidentally not provide dependencies, for example unit tests, because there no longer is a constructor without the dependencies."

### For which Domain-Driven Design (DDD) building blocks is dependency injection typically used?

- [ ] Only for Entities and Value Objects.
- [ ] For all building blocks, including Entities and Value Objects.
- [x] For Services, Factories, and Repositories, but not for Entities and Value Objects.
- [ ] It is not used for any DDD building blocks.

**Rationale:** The text specifies, "And in case you were wondering how dependency injection applies to the domain-driven design building blocks we discussed earlier on, you use it for services, factories and repositories, but not for entities and value objects."

### What is the core idea behind the Dependency Inversion Principle (DIP)?

- [ ] High-level modules should depend on low-level modules.
- [x] High-level modules should not depend on low-level modules. Both should depend on abstractions.
- [ ] Abstractions should depend on details.
- [ ] All modules should be independent of each other.

**Rationale:** The text states: "The dependency inversion principle states that high-level modules should not depend on low-level modules. Both should depend on abstractions. And abstractions should not depend on details. Details should depend on abstractions."

### What is the "Hollywood principle" and how does it relate to Inversion of Control?

- [ ] It's a principle that states that all software should be glamorous.
- [x] It's a common way to explain Inversion of Control: "Don't call us, we'll call you."
- [ ] It's a principle that encourages tight coupling.
- [ ] It's a principle that promotes direct control flow.

**Rationale:** The text states: "The dependency inversion principle has two practical incarnations. One of them is the paradigm of inversion of control, or IOC, sometimes called the Hollywood principle. Don't call us, we'll call you."

### What are the three common ways to implement Dependency Injection?

- [x] Constructor Injection
- [x] Setter Injection
- [x] Field Injection
- [ ] Manual Injection
- [ ] Interface Injection

**Rationale:** The text lists: "There are three common ways to implement dependency injection. Constructor injection, setter injection, and field injection."

### What is a disadvantage of "Setter Injection" compared to "Constructor Injection"?

- [ ] It makes the code more readable.
- [x] It allows for objects to be created without their dependencies, potentially leading to null pointer exceptions if not handled carefully.
- [ ] It is less flexible.
- [ ] It requires more boilerplate code.

**Rationale:** The text implies this by highlighting the benefit of constructor injection: "The benefit is that now there is actually no easy way to accidentally not provide dependencies, for example unit tests, because there no longer is a constructor without the dependencies." This contrasts with setter injection where dependencies can be set after construction.

### What is the primary distinction between "layering" and "tiering" in software architecture?

- [ ] Layering refers to the physical deployment, while tiering refers to the logical structure.
- [x] Layering refers to the purely logical structure of a system, while tiering refers to how the system is physically deployed and distributed.
- [ ] Layering is about horizontal separation, and tiering is about vertical separation.
- [ ] There is no distinction; the terms are interchangeable.

**Rationale:** The text explains, "on the right side, you see purely logical structure... The question is, how do you actually deploy this? Because, well, do you want to deploy it in one big thing, or do you want to slice and dice it somehow? On this, slicing and dicing, basically, that's about tiering."

### In a typical three-tier architecture, where might a "cut" occur that goes through a logical layer, rather than between them?

- [ ] Between the business logic and infrastructure layers.
- [x] Right through the presentation layer, separating, for example, the servlet/controller from the view.
- [ ] Between the application logic and business logic.
- [ ] Only at the very top of the system, above all logical layers.

**Rationale:** The text provides an example: "if you go to the top, then you see that there's actually a cut right through the presentation layer, because you have the servlet or the rights of the controller, and then you have the view, but these things actually are all presentation logic, but for some reason, you decide that you want to pre-render them on the server and just have a cut there..."

### What are the two main perspectives that influence decisions about tiering, as discussed in the text?

- [ ] Financial and legal perspectives.
- [ ] Marketing and sales perspectives.
- [x] The developer's perspective (e.g., accessibility, minimal overhead, ease of development) and the user's perspective (e.g., functionality, usability, performance).
- [ ] The hardware and software vendor perspectives.

**Rationale:** The text highlights these two sides: "many people who are in software architecture look at this from their perspective, saying, okay, well, we have all these logical structures... but of course, that's just one side of the equation, and the other side of the equation is, there's also users who are actually using the system, and they actually care about, well, how functional is the whole thing, how easy to use it, how performative is the whole thing..."

### What is the primary concern when making tiering decisions from the developer's perspective?

- [ ] How visually appealing the user interface will be.
- [x] Accessibility, minimal overhead, and ease of development.
- [ ] The marketing strategy for the software.
- [ ] The long-term maintainability of the business logic.

**Rationale:** The text implies this by contrasting it with the user's perspective: "many people who are in software architecture look at this from their perspective, saying, okay, well, we have all these logical structures... but of course, that's just one side of the equation, and the other side of the equation is, there's also users who are actually using the system, and they actually care about, well, how functional is the whole thing, how easy to use it, how performative is the whole thing..." The developer's perspective is about how to build it efficiently.

### What is the primary concern when making tiering decisions from the user's perspective?

- [ ] The internal code structure and modularity.
- [x] Functionality, usability, and performance.
- [ ] The choice of programming languages and frameworks.
- [ ] The cost of hardware infrastructure.

**Rationale:** The text states: "the other side of the equation is, there's also users who are actually using the system, and they actually care about, well, how functional is the whole thing, how easy to use it, how performative is the whole thing..."

### What is the primary characteristic of a "Fat Client" from a user's perspective?

- [ ] It requires constant server roundtrips for every action.
- [ ] It is difficult to integrate with the local operating system.
- [x] Everything runs on the local machine, making it super fast and fully integrated, similar to a desktop application.
- [ ] It is primarily designed for web-based interactions.

**Rationale:** The text states, "From a user perspective, a fat client is the greatest thing on earth. Everything runs on your machine... it's super fast known."

### What is the main advantage of a "Thin Client" from a developer's perspective, compared to a Fat Client?

- [ ] It allows for more complex application logic on the client side.
- [x] It avoids duplicating application logic for every platform, as it's done once on the server.
- [ ] It provides a richer user experience with less noticeable server roundtrips.
- [ ] It eliminates the need for any presentation logic.

**Rationale:** The text explains, "Thin clients don't duplicate the application logic. It's just done once on the server, and that's it for all different presentations. So maybe Linux, maybe Windows, maybe Mac, or something else, one application logic. Only the presentation logic is duplicated. And that's of course way less work for developers."

### What is the goal of a "Rich Client" architecture?

- [ ] To maximize the amount of application logic on the server.
- [ ] To completely eliminate server roundtrips.
- [x] To strike a balance between user concerns (speed, responsiveness) and developer concerns (less platform-specific duplication).
- [ ] To ensure that all data is stored locally on the client machine.

**Rationale:** The text describes it as: "A rich client is trying to strike a balance between user concerns and developer concerns."

### From whose perspective is an "Ultra Thin Client" (or Zero Client) considered the "best thing that can happen"?

- [ ] The end-user, due to its seamless integration.
- [ ] The marketing team, due to its broad appeal.
- [x] The developer or administrator, due to its ease of installation and single software chunk.
- [ ] The quality assurance team, due to its simplified testing.

**Rationale:** The text states, "If we describe the fat client as the best thing that can happen to a user, then the thing all the way on the left is the best thing that can happen to a developer or administrator."

### What is a significant drawback of an "Ultra Thin Client" from a user's perspective?

- [ ] It requires a very powerful local machine.
- [ ] It has too many features, making it complex to use.
- [x] It often lacks integration with the local operating system and can be tedious to work with, leading to a poor user experience.
- [ ] It frequently crashes due to its complexity.

**Rationale:** The text notes, "for the user, it's complicated. So there's a special way to access it, the terminal that you used to access is pretty dumb, there's no integration with your own operating system or whatever platform you're working on, so it's tedious to work with that, think Citrix or things like that, so it's not the best user experience, actually it's the worst of all..."

### What is the primary characteristic of a "Fat Client" from a developer's perspective?

- [ ] It is easy to deploy and maintain.
- [x] It requires duplicating application logic for every platform, leading to more work.
- [ ] It simplifies testing due to its self-contained nature.
- [ ] It has minimal impact on the local machine's resources.

**Rationale:** The text states: "From a developer perspective, it's a nightmare because you have to duplicate the application logic for every platform."

### What is the primary characteristic of a "Thin Client" from a user's perspective?

- [ ] It is super fast and fully integrated with the local machine.
- [x] It requires constant server roundtrips, leading to a less responsive experience.
- [ ] It has a rich, interactive user interface.
- [ ] It stores all data locally.

**Rationale:** The text states: "From a user perspective, it's a nightmare because every single interaction with the system requires a server roundtrip, so it's slow, it's not responsive."

### What is the primary characteristic of a "Rich Client" from a developer's perspective?

- [ ] It requires duplicating all application logic for every platform.
- [x] It aims to avoid duplicating application logic for every platform by keeping it on the server, while still providing a good user experience.
- [ ] It is the easiest to develop due to minimal client-side code.
- [ ] It completely eliminates the need for server-side processing.

**Rationale:** The text states: "From a developer perspective, it's a good thing because you don't have to duplicate the application logic for every platform. It's just done once on the server, and that's it for all different presentations."

### What is the primary characteristic of an "Ultra Thin Client" from a developer's perspective?

- [ ] It requires complex client-side development.
- [x] It is the easiest to develop and deploy, as it's a single software chunk on the server.
- [ ] It offers the most flexibility for client-side customization.
- [ ] It requires extensive platform-specific coding.

**Rationale:** The text states: "If we describe the fat client as the best thing that can happen to a user, then the thing all the way on the left is the best thing that can happen to a developer or administrator. It's just one software chunk that you have to deploy on the server, and that's it."

### What is the purpose of the framework introduced in the text regarding client-server cuts?

- [ ] To force all systems to use a thin client architecture.
- [ ] To provide a rigid set of rules for client-server communication.
- [x] To help architects pick the right client-server cut based on the kind of user interaction and specific user needs.
- [ ] To eliminate the need for user input in system design.

**Rationale:** The text states, "On the following slides, let me introduce you a framework that might help you to pick the right cut following the kind of user interaction."

### Which of the following dimensions are used in the framework to help decide on the right client-server cut?

- [ ] Development cost and time to market.
- [x] IT knowledge, Variety of tasks, Extent of support, and Amount of flexibility.
- [ ] Server processing power and network bandwidth.
- [ ] Programming language and database type.

**Rationale:** The text introduces the framework: "You see four dimensions that can help you make that decision. Let's look at a campaign manager and what do campaign managers do. I work normally with lots of software for planning, for financing, communications, other things, so they have to have good IT knowledge because they have lots of software that they deal with. That's a great variety of tasks that have to be done all day over, so that's pretty high. The extent of support, well, it's not going all the way because software, of course, should help you figure out things. Then amount of flexibility, well, there's always some interruption going on in the life of a campaign manager, so there's lots of flexibility that you require."

### How does the user profile of a self-service machine (like an ATM) differ from that of a campaign manager, according to the text?

- [ ] ATMs require high IT knowledge and high task variety.
- [x] ATMs require next to zero IT knowledge, have very low task variety, but super high extent of support and very low flexibility.
- [ ] ATMs are designed for high flexibility and low support.
- [ ] ATMs are similar to campaign managers in all aspects.

**Rationale:** The text contrasts them: "Even a 95-year-old senior should be able to use this ATM, so the degree of IT knowledge for that group is next to zero. The variety of tasks is very low, too... But the extent of support, because the degree of IT knowledge is so low, is super high... But the amount of flexibility is very low."

### What is a key characteristic of a call center agent's workplace software, as described in the text?

- [ ] High IT knowledge and high flexibility.
- [x] Designed for a single task (e.g., taking orders), very low task variety, and moderate support with low flexibility.
- [ ] Very high variety of tasks and minimal support.
- [ ] It is a general-purpose office suite.

**Rationale:** The text describes it: "Normally, it's a software that just designed for a single task, for example, take audits... The variety of tests is very low... The extent of support is somewhere in the middle... And the amount of flexibility is very low."

### What is the overall conclusion drawn from analyzing different user profiles and their interaction needs?

- [ ] All users ultimately require the same type of client experience.
- [ ] The choice of client type is purely a technical decision.
- [x] There is no single typical workplace or client that a user requires, and different user requirements may lead to opting for different client types.
- [ ] User input is irrelevant when deciding on client-server architecture.

**Rationale:** The text concludes: "And if you look at all these diagrams in retrospect, there's no single typical workplace or client that a user requires. So depending on the different requirements, you may very well opt for a different type of client for a different kind of user experience."

### What are the four dimensions used in the framework to help decide on the right client-server cut?

- [x] IT knowledge
- [x] Variety of tasks
- [x] Extent of support
- [x] Amount of flexibility
- [ ] Cost
- [ ] Performance

**Rationale:** The text explicitly lists: "You see four dimensions that can help you make that decision. Let's look at a campaign manager and what do campaign managers do. I work normally with lots of software for planning, for financing, communications, other things, so they have to have good IT knowledge because they have lots of software that they deal with. That's a great variety of tasks that have to be done all day over, so that's pretty high. The extent of support, well, it's not going all the way because software, of course, should help you figure out things. Then amount of flexibility, well, there's always some interruption going on in the life of a campaign manager, so there's lots of flexibility that you require."

### How does the "Extent of support" dimension relate to the "IT knowledge" dimension for a user?

- [ ] They are directly proportional; high IT knowledge means high support.
- [x] They are inversely proportional; low IT knowledge often requires high support.
- [ ] They are unrelated.
- [ ] High IT knowledge always eliminates the need for support.

**Rationale:** The text states for the ATM example: "Even a 95-year-old senior should be able to use this ATM, so the degree of IT knowledge for that group is next to zero... But the extent of support, because the degree of IT knowledge is so low, is super high." This indicates an inverse relationship.

### What is the primary reason for integrating multiple applications horizontally?

- [ ] To reduce the number of applications a user needs to interact with.
- [x] To avoid duplicating input and repetitive tasks, and to provide a unified access pattern.
- [ ] To ensure that each application works in complete isolation.
- [ ] To increase the complexity of the overall system.

**Rationale:** The text states, "because actually what people want to do is not work with just one single application, but with many applications, and those applications have to be integrated somehow, because if you have to do everything in isolation, you have to duplicate input, you have to do the same things over and over again, and you don't want this. You want everything, if you can, with one unified access pattern."

### Which of the following are listed as the four basic options for integrating applications horizontally?

- [x] File Transfer
- [x] Shared Database
- [x] Remote Procedure Invocation
- [x] Messaging
- [ ] API Gateway
- [ ] Event Streaming

**Rationale:** The text explicitly lists them: "Basically, there's four options. One is file transfer, one is shared database, one is remote procedure invocation, and the last and most complicated, but most rewarding one is messaging." This format allows students to demonstrate knowledge of each individual integration method rather than memorizing them as a single unit.

### What is the primary goal of integration in software architecture?

- [ ] To make each application completely independent.
- [x] To allow multiple applications to work together seamlessly, avoiding duplicated input and repetitive tasks.
- [ ] To reduce the number of applications in an enterprise.
- [ ] To enforce a single technology stack across all applications.

**Rationale:** The text states: "because actually what people want to do is not work with just one single application, but with many applications, and those applications have to be integrated somehow, because if you have to do everything in isolation, you have to duplicate input, you have to do the same things over and over again, and you don't want this. You want everything, if you can, with one unified access pattern."

### What is the fundamental mechanism of application integration using "File Transfer"?

- [ ] Applications communicate directly via network sockets.
- [ ] Applications share data through a common in-memory cache.
- [x] One application (exporter) writes data to a shared file system, and another application (importer) reads from it.
- [ ] Applications exchange data through remote procedure calls.

**Rationale:** The text explains, "And as the name implies, it works via the file system. ...And one application, the exporter, writes to that file system, and the other application, B, the importer, reads from that file system."

### Which of the following are advantages of using File Transfer for application integration?

- [x] No need for additional software or extra skills, as file system access is universal.
- [ ] Guarantees real-time data consistency between applications.
- [x] It is totally asynchronous, allowing loose coupling between applications.
- [ ] Requires significant invasive programming changes to core application functionality.
- [x] Core application functionality remains unchanged, with integration handled by an external wrapper.

**Rationale:** The text lists advantages: "There's no need for addition software... There's no extra skills required... It's totally asynchronous... There's no need to synchronize the two. So there's loose coupling between the applications, and there's actually no big changes going on inside the application, because basically there's a wrapper that you put on the outside of the application..."

### What is a significant disadvantage of File Transfer integration, particularly concerning data?

- [ ] It is too complex to implement for most teams.
- [x] There can be a gap between writing and reading data, leading to inconsistencies in the reading application.
- [ ] It requires both applications to be online and running simultaneously.
- [ ] It only supports binary data formats, not text-based ones.

**Rationale:** The text highlights this issue: "Well, the thing is that if you write the data at one point and read the data at a different point, then of course there's a gap between those two things, and inside that period things might change. So you could have inconsistencies in the reading application..."

### How can the problem of data inconsistency in File Transfer be ameliorated?

- [ ] By using a different file system protocol.
- [x] By making the gaps between writing and reading smaller, for example, by writing data more frequently.
- [ ] By manually synchronizing the data between applications.
- [ ] By completely eliminating the file system and using a shared database instead.

**Rationale:** The text suggests, "What you can do to ameliorate this is to make these gaps smaller. So you write data not just once a week, for example, but once a day or once an hour, or if you go to extremes even every minute or in intervals that are even smaller, so less than a minute."

### What additional consideration arises when increasing the frequency of data writing in File Transfer?

- [ ] The need for more complex data formats.
- [x] The need to manage large volumes of data, including thinking about file organization, cleanup routines, and storage space.
- [ ] A decrease in the overall performance of the system.
- [ ] The requirement for a dedicated server for file transfers.

**Rationale:** The text explains, "But if you do that, then of course you're having lots of data that you're writing, and you have to think about not just what's inside the file, but how you organize the file... And then you have to of course think about, well, what do we do with all this data? Because if you write data, data, data, then of course the drive might fill up pretty quickly and you have to think about, well, how long do we keep this around? When do we clean this up?"

### What is the role of an "external wrapper" in File Transfer integration?

- [ ] To modify the core functionality of the applications.
- [x] To handle the integration without requiring big changes inside the core application.
- [ ] To convert data formats between incompatible systems.
- [ ] To provide real-time synchronization of data.

**Rationale:** The text states: "there's actually no big changes going on inside the application, because basically there's a wrapper that you put on the outside of the application, and that wrapper is responsible for writing the data to the file system or reading the data from the file system."

### What is a key characteristic of File Transfer integration regarding its synchronicity?

- [ ] It is always synchronous, requiring both applications to be active simultaneously.
- [x] It is totally asynchronous, allowing loose coupling between applications.
- [ ] It can be either synchronous or asynchronous depending on the file system.
- [ ] It requires a dedicated synchronization service.

**Rationale:** The text states: "It's totally asynchronous. There's no need to synchronize the two. So there's loose coupling between the applications, and there's actually no big changes going on inside the application, because basically there's a wrapper that you put on the outside of the application, and that wrapper is responsible for writing the data to the file system or reading the data from the file system."

### What is a potential issue with File Transfer integration if the data is not written frequently enough?

- [ ] The file system will become corrupted.
- [x] Inconsistencies can arise in the reading application due to a gap between writing and reading data.
- [ ] The applications will become tightly coupled.
- [ ] The file transfer will fail silently.

**Rationale:** The text states: "Well, the thing is that if you write the data at one point and read the data at a different point, then of course there's a gap between those two things, and inside that period things might change. So you could have inconsistencies in the reading application."

### What is the primary advantage of using a "Shared Database" for application integration compared to file transfer, especially for frequent updates?

- [ ] It eliminates the need for any data format agreement.
- [x] It provides immediate data consistency, as changes are visible to all applications the moment they are committed.
- [ ] It requires less technical skill to implement.
- [ ] It allows for completely independent development of applications.

**Rationale:** The text states, "The first and foremost one is, of course, that we don't have to wait between these intervals... But now, just one application is committing, and the same second, everyone else sees the same data."

### Which of the following are advantages of using a Shared Database for integration?

- [x] Immediate data consistency.
- [ ] Reduced need for SQL drivers or OR mappers.
- [x] Ubiquitous access due to common SQL drivers and OR mappers.
- [x] Can encourage data cleanup and better modeling within the shared schema.
- [ ] Eliminates all semantic dissonance.

**Rationale:** The text lists: "The first and foremost one is, of course, that we don't have to wait between these intervals... But the same is actually true for databases, because SQL drivers and OR mappers are ubiquitous... if you open your schema to other people you want to communicate with... that might help you to clean up your data to get better models and have everything in proper order."

### What is a significant disadvantage of the Shared Database approach concerning encapsulation?

- [ ] It makes it harder to access the database from different programming languages.
- [x] It breaks encapsulation because other applications see more of the internal data and schema than they actually need.
- [ ] It requires each application to have its own separate database.
- [ ] It leads to a less organized database schema.

**Rationale:** The text explains, "Encapsulation meaning that if you have a database schema for communication, that's not dedicated just to communication... then of course, you see more data than you actually need to see. So you see other tables or more attributes, and that of course breaks the encapsulation of your application..."

### What is the primary issue related to "coupling" when using a Shared Database for integration?

- [ ] It leads to loose coupling, making changes easier.
- [x] It results in strong coupling, as changes to the shared schema in one application require changes everywhere else.
- [ ] It only affects the coupling of the database, not the applications.
- [ ] It promotes independent schema evolution for each application.

**Rationale:** The text states, "The final disadvantage is strong coupling, because you're using the same database schema across multiple applications, so if you change the schema in one application, you have to change it everywhere else. That's strong coupling."

### In what scenario would a Shared Database integration NOT be feasible?

- [ ] When applications are developed by different teams.
- [ ] When the applications are located on the same server.
- [x] When integrating with an external database system that is not accessible to your applications.
- [ ] When the data needs to be highly consistent.

**Rationale:** The text mentions, "And of course, if you try to integrate with an external database system that counts with its own database, but this database is not accessible to you, then of course, you cannot use that for sharing database access."

### What is a potential advantage of a Shared Database approach regarding data quality and modeling?

- [ ] It allows for completely independent data models for each application.
- [x] It can encourage data cleanup and better modeling within the shared schema.
- [ ] It eliminates the need for any data validation.
- [ ] It promotes data duplication across applications.

**Rationale:** The text states: "if you open your schema to other people you want to communicate with... that might help you to clean up your data to get better models and have everything in proper order."

### What is "semantic dissonance" in the context of Shared Database integration?

- [ ] When the database is too slow to respond to queries.
- [x] When different applications interpret the same data in the shared database differently, leading to misunderstandings.
- [ ] When the database schema is too complex.
- [ ] When the database is not accessible to all applications.

**Rationale:** The text explains: "The second disadvantage is semantic dissonance. So if you have a database schema that is used by multiple applications, then of course, you have to agree on the meaning of the data. And if you don't, then you have semantic dissonance, meaning that one application might interpret the data in a different way than the other application."

### What is a key challenge when using a Shared Database for integration, particularly when dealing with legacy systems?

- [ ] Legacy systems always have perfectly clean data.
- [x] Legacy systems often have dirty data, and cleaning it up for a shared database can be a significant effort.
- [ ] Legacy systems are always easy to integrate with new databases.
- [ ] Legacy systems do not use databases.

**Rationale:** The text states: "And the third disadvantage is that if you have legacy systems, then of course, you have to deal with dirty data. And if you want to use a shared database, then you have to clean up the data, and that can be a lot of effort."

### What is the key concept of Remote Procedure Invocation (RPI) for application integration?

- [ ] Moving data across the network to perform local calculations.
- [x] Accessing functionality on a remote server, where the calculations are performed, rather than moving data.
- [ ] Sharing a common database schema between applications.
- [ ] Transferring files between applications via a shared file system.

**Rationale:** The text states, "A key concept of remote procedure vocation is sharing functionality. So instead of moving data across the network and then doing some calculations on it locally, here you access that functionality on a remote server."

### Which of the following are advantages of using Remote Procedure Invocation?

- [ ] It guarantees that the remote server is always available.
- [x] Functionality gets reused, avoiding code duplication.
- [ ] It eliminates all network latency issues.
- [x] Data is fully encapsulated on the remote side, reducing coupling.

**Rationale:** The text lists advantages: "It's a major advantage that functionality gets reused, so we don't have to implement some functionality on the server and the client all the other way around... And the data, of course, because it's not moved around, is fully encapsulated. The application that we're calling knows how the data is kept, but we don't know it and so there's no coupling between the two."

### What is a significant disadvantage of Remote Procedure Invocation concerning server availability?

- [ ] The remote server can be offline without affecting the calling application.
- [x] If the remote server is not up, the calling application cannot access the functionality and cannot perform the task on its own.
- [ ] The remote server automatically scales to handle any load.
- [ ] The remote server only needs to be online during deployment.

**Rationale:** The text highlights this disadvantage: "the server that serves the data has to be up. If it's not up, then we cannot access the functionality and because we don't have the data on our side, we cannot do it on our own, so we rely on that server being up."

### What is a potential performance issue with RPI?

- [ ] It always performs faster than local execution.
- [x] High latency and delays can occur because data is not local and must be retrieved over the network.
- [ ] It requires a dedicated high-speed local network connection.
- [ ] Performance is only affected if the remote server is underutilized.

**Rationale:** The text mentions, "The same thing happens talking about performance, because we don't have the data locally, we have to get it over the network and that means it can be delayed, there could be high latency, something like that can happen, that's another drawback."

### How do cyclic dependencies manifest in the context of RPI, and what is their impact?

- [ ] They are always beneficial for performance.
- [ ] They are easily visible and automatically resolved by the RPI framework.
- [x] They can occur between applications, leading to deadlocks that are difficult to disentangle, similar to cycles between other building blocks.
- [ ] They only affect the data format, not the application logic.

**Rationale:** The text warns, "We talked about the last thing already, way earlier in chapter two, we talked about cycles, but back then we talked about building blocks that were classes or modules and in this case, we're talking about code applications. No application according to the other and that application waiting for that could lead to a deadlock and those deadlocks can be as hard to disentangle as cycles between the other kind of building blocks we talked before."

### What is the primary benefit of RPI regarding data encapsulation?

- [ ] Data is duplicated across all applications.
- [x] Data is fully encapsulated on the remote side, reducing coupling between applications.
- [ ] Data is always transferred to the client for local processing.
- [ ] Data is stored in a shared database.

**Rationale:** The text states: "And the data, of course, because it's not moved around, is fully encapsulated. The application that we're calling knows how the data is kept, but we don't know it and so there's no coupling between the two."

### What is a key challenge with RPI when the remote server is not available?

- [ ] The calling application can still perform the task using local data.
- [x] The calling application cannot access the functionality and cannot perform the task on its own.
- [ ] The RPI framework automatically redirects the call to a backup server.
- [ ] The remote server will automatically restart itself.

**Rationale:** The text states: "the server that serves the data has to be up. If it's not up, then we cannot access the functionality and because we don't have the data on our side, we cannot do it on our own, so we rely on that server being up."

### What is the impact of network latency on RPI performance?

- [ ] Network latency has no impact on RPI performance.
- [x] High latency and delays can occur because data is not local and must be retrieved over the network.
- [ ] RPI is designed to eliminate network latency.
- [ ] Network latency only affects the initial connection, not subsequent calls.

**Rationale:** The text states: "The same thing happens talking about performance, because we don't have the data locally, we have to get it over the network and that means it can be delayed, there could be high latency, something like that can happen, that's another drawback."

### What is the key concept of application integration using "Messaging"?

- [ ] Direct, synchronous communication between applications.
- [x] Applications connect to a message bus and address partners abstractly, leading to loose coupling.
- [ ] Sharing a common file system for data exchange.
- [ ] Relying on remote procedure calls for all interactions.

**Rationale:** The text states, "The key concept of messaging is that everyone is connected to a message bus. And you're addressing the partner you're talking with in an abstract way, just knowing an abstract address, not the concrete address like with remote procedure invocation, just an abstract address, and that's all you know."

### What is a significant advantage of Messaging over Remote Procedure Invocation (RPI) concerning reliability?

- [ ] Messaging requires both partners to be online simultaneously.
- [x] Messaging offers persistent queues or topics, ensuring data delivery even if a system goes down and comes back up.
- [ ] Messaging is inherently less reliable due to its asynchronous nature.
- [ ] Messaging eliminates the need for any error handling.

**Rationale:** The text highlights, "With remote procedure invocation, you always had to worry about the partner going down or at least not being up. But here you can have persistent queues, for example, or topics. And if the system goes down, everything is persisted. And if the system comes up, everything that has been in the queue or in the topic is put in there again and will be delivered. So way more reliable than remote procedure invocation."

### What is the main disadvantage of using Messaging for application integration?

- [ ] It is too simple and lacks necessary features.
- [ ] It only supports synchronous communication.
- [x] Its inherent complexity, requiring handling of the technology and semantic differences.
- [ ] It forces applications to be tightly coupled.

**Rationale:** The text explicitly states, "Yes, it's complex... But besides that, the complexity of the thing is the main disadvantage."

### What does the concept of "send and forget" or "store and forward" imply in messaging?

- [ ] The sender must wait for an immediate acknowledgment from the receiver.
- [x] The sender sends a message and does not need to worry about when or if it will be read, as the system handles delivery.
- [ ] The message is immediately deleted after being sent.
- [ ] The sender is responsible for ensuring the receiver is online.

**Rationale:** The text explains, "That means the core concept is send and forget. We just send it over just like we send an email, send the text message, or in the old days, write a letter, put it in a letterbox, and then we don't have to worry about it anymore. We don't know when this will be read, and we don't have to worry about it. Or it's called stored forward."

### Which of the following are advantages of Messaging, as described in the text?

- [x] No location dependencies, as concrete recipient addresses are not known.
- [x] No temporal dependencies, allowing asynchronous communication.
- [ ] It requires all data to be in a fixed, non-descriptive format.
- [x] It removes data from dependencies by allowing self-describing data formats.

**Rationale:** The text lists these advantages: "First thing is no location dependencies anymore... We have no temporal dependencies... And the third advantage is it removes data from our dependencies, because it's not like in the old days where we had some Byzantine data structures, and we don't know, well, what does this mean? Whereas the manual, we can have self-describing data."

### How does messaging eliminate location dependencies?

- [ ] By requiring exact IP addresses for all communications
- [x] By using abstract addressing so concrete recipient addresses are not known
- [ ] By storing all data in a centralized location
- [ ] By requiring all applications to be on the same server

**Rationale:** The text explains: "First thing is no location dependencies anymore. So we don't know the concrete address of the receiver and we don't have to, so we have no location dependencies."

### What does "no temporal dependencies" mean in messaging?

- [ ] All messages must be sent at specific scheduled times
- [x] Applications can communicate asynchronously without both being online simultaneously
- [ ] Messages are deleted immediately after being sent
- [ ] Applications must process messages in strict chronological order

**Rationale:** The text states: "We have no temporal dependencies. So both don't have to be there at the same time. We can have asynchronous communication."

### How does messaging remove data dependencies?

- [ ] By requiring all data to use identical formats
- [x] By allowing self-describing data formats instead of Byzantine data structures
- [ ] By eliminating the need for any data exchange
- [ ] By forcing all applications to use the same database

**Rationale:** The text explains: "And the third advantage is it removes data from our dependencies, because it's not like in the old days where we had some Byzantine data structures, and we don't know, well, what does this mean? Whereas the manual, we can have self-describing data."

### What is the role of a "message bus" in messaging integration?

- [ ] It stores all application data.
- [x] It acts as a central point where applications connect and exchange messages.
- [ ] It performs complex business logic.
- [ ] It translates messages between different programming languages.

**Rationale:** The text states: "The key concept of messaging is that everyone is connected to a message bus."

### What is the primary benefit of "persistent queues or topics" in messaging?

- [ ] They reduce the number of messages sent.
- [x] They ensure data delivery even if a system goes down and comes back up, improving reliability.
- [ ] They force synchronous communication.
- [ ] They eliminate the need for any network infrastructure.

**Rationale:** The text highlights: "But here you can have persistent queues, for example, or topics. And if the system goes down, everything is persisted. And if the system comes up, everything that has been in the queue or in the topic is put in there again and will be delivered. So way more reliable than remote procedure invocation."

### What is a key difference in resource utilization between a synchronous and an asynchronous order processing system, as illustrated by the bakery and Starbucks models?

- [ ] Synchronous systems are always more efficient because they process one order at a time.
- [x] Asynchronous systems are more efficient because they allow parallel processing and avoid idle periods, serving multiple customers concurrently.
- [ ] Synchronous systems require more re-synchronization efforts.
- [ ] Asynchronous systems are only suitable for very small order volumes.

**Rationale:** The text contrasts the two: "On the right side, you have the Starbucks model, you place your order... then the next one is being served while your order is already prepared in the background... So there's no idle period. On the website, everything is working in parallel, and because everything is working in parallel, this is way more efficient."

### What is a crucial aspect that needs to be managed in an asynchronous messaging system, as exemplified by the Starbucks model?

- [ ] Ensuring that all orders are processed in the exact sequence they were received.
- [ ] Avoiding any form of re-synchronization with the customer.
- [x] Reconnecting to the customer and bringing the results and requests back together once everything is ready.
- [ ] Limiting the number of producers and consumers to avoid chaos.

**Rationale:** The text states, "If you do everything in parallel, of course, you have to bring the results and the requests back together. So when everything is ready and has been prepared, then you have to reconnect to the customer."

### What are two important rules or characteristics of messaging systems that help manage potential chaos from asynchronous operations?

- [ ] Messages must always be processed in the order they were sent, and consumers can read messages multiple times.
- [x] Queues can be configured to be persistent (data is not lost if the system goes down), and every message can only be read once by a consumer.
- [ ] All messages must be acknowledged immediately by the consumer, and producers must wait for confirmation.
- [ ] Messaging systems automatically handle all semantic differences between messages.

**Rationale:** The text mentions: "you can configure all the queues to be persistent. So if the system goes down, everything is still there, nothing has been lost. So that's a big advantage over remote procedure and vocation. And there's another rule, every message can only be read once by a consumer."

### When multiple producers and consumers share the same queue, what is a key challenge that arises?

- [ ] Ensuring that only one producer can write to the queue at a time.
- [ ] Guaranteeing that messages are delivered to all consumers simultaneously.
- [x] Dealing with the uncertainty of the order in which messages will be executed by consumers.
- [ ] Preventing any message from being consumed by more than one consumer.

**Rationale:** The text illustrates this with an example: "But being more efficient, actually, many producers and consumers can share the same queue. And then, of course, you have to worry about the order in which things are executed... No one could have foreseen that order, and you have to be able to deal with these kinds of insecurities, not knowing in what order things will be executed."

### What is the rule regarding message consumption by consumers in a messaging system?

- [ ] Every message can be read multiple times by any consumer.
- [x] Every message can only be read once by a consumer.
- [ ] Messages are automatically deleted after being read by one consumer.
- [ ] Only the first consumer to read a message can process it.

**Rationale:** The text states: "And there's another rule, every message can only be read once by a consumer."

### What is the implication of multiple producers and consumers sharing the same queue regarding message execution order?

- [ ] Messages are always executed in the exact order they were sent.
- [x] The order in which messages will be executed by consumers is uncertain, and the system must be able to deal with this.
- [ ] Each consumer processes messages in its own independent order.
- [ ] The message bus guarantees a strict execution order.

**Rationale:** The text states: "But being more efficient, actually, many producers and consumers can share the same queue. And then, of course, you have to worry about the order in which things are executed... No one could have foreseen that order, and you have to be able to deal with these kinds of insecurities, not knowing in what order things will be executed."

### What is the role of a "message bus" in messaging integration?

- [ ] It stores all application data.
- [x] It acts as a central point where applications connect and exchange messages.
- [ ] It performs complex business logic.
- [ ] It translates messages between different programming languages.

**Rationale:** The text states: "The key concept of messaging is that everyone is connected to a message bus."

### What is the primary benefit of "persistent queues or topics" in messaging?

- [ ] They reduce the number of messages sent.
- [x] They ensure data delivery even if a system goes down and comes back up, improving reliability.
- [ ] They force synchronous communication.
- [ ] They eliminate the need for any network infrastructure.

**Rationale:** The text highlights: "But here you can have persistent queues, for example, or topics. And if the system goes down, everything is persisted. And if the system comes up, everything that has been in the queue or in the topic is put in there again and will be delivered. So way more reliable than remote procedure invocation."

### What is a major challenge of the messaging programming model, as described in the text?

- [ ] It is too simple and lacks necessary features.
- [ ] It only supports synchronous communication, leading to bottlenecks.
- [x] It is a complex, event-driven model with distributed logic, making debugging across process boundaries challenging.
- [ ] It eliminates the need for any form of data synchronization.

**Rationale:** The text states, "First of all, as you already said, it's a complex programming model. It's event-driven, the logic is distributed between multiple event handlers and debugging, of course, across these process boundaries can be a real challenge."

### What does the text identify as a challenge related to message sequence in messaging systems?

- [ ] Messages are never delivered in any order.
- [ ] Messages are always delivered in the exact order they were sent, which can cause performance issues.
- [x] While every message is delivered, the order is not guaranteed, requiring potential reordering before use.
- [ ] Messages are often lost if the sequence is not strictly maintained.

**Rationale:** The text explains, "A sequence is not sure. We know that every message is actually delivered, but we don't know in what order, so we might have to reorder messages before we use them."

### How does the asynchronous nature of messaging impact user expectations, and what must be done to address it?

- [ ] Users expect immediate synchronous responses, which messaging systems always provide.
- [ ] Users must be trained to expect delays, but no specific communication is needed.
- [x] Users must get used to the asynchronous model, and applications must communicate that orders are received but status updates will follow later.
- [ ] Asynchronous messaging has no impact on user expectations.

**Rationale:** The text notes, "So we have to tell people, yes, we took your order, but we cannot tell you the status of it right now. Please wait and we let you know. So users must get used to this kind of model..."

### What is "initialization data" in the context of messaging challenges, and how can its impact on performance be mitigated?

- [ ] It refers to the core business data exchanged, which always slows down the system.
- [x] It is data needed to set up applications, and its transfer can be offloaded (e.g., via file transfer) to avoid perturbing the main message traffic.
- [ ] It is data that is only used once and then discarded.
- [ ] It is data that must always be sent synchronously over the message bus.

**Rationale:** The text defines it: "initialization data. So that is data that we need to set up all our applications, and that's in addition to the core data that they're exchanging... What we can do in this case is to deliver this initialization data of the grid, so to speak. So we use, for example, five transfer to get that in sync..."

### What challenges arise when dealing with specific vendors or platforms in messaging?

- [ ] All vendors provide identical functionality and adhere to the same standards.
- [x] Vendors may limit possibilities, offer non-standard extra functionality, or use different standards, requiring brokering between them.
- [ ] Vendor-specific features always simplify integration.
- [ ] There are no challenges, as messaging is a fully standardized technology.

**Rationale:** The text explains, "So one vendor might limit the possibilities of what you can do. Others might implement some extra functionality that goes beyond the standard, but can be very useful, but it's not available from a different vendor. And of course, if you're trying to use various kinds of message-oriented middlewares, then of course, they might use different standards, and you have to broker between them."

### What is a key challenge related to debugging in a messaging system?

- [ ] Debugging is impossible due to the asynchronous nature.
- [x] Debugging across process boundaries can be a real challenge due to distributed logic and event-driven nature.
- [ ] Debugging is simplified because each component is isolated.
- [ ] Debugging only requires examining a single log file.

**Rationale:** The text states: "It's event-driven, the logic is distributed between multiple event handlers and debugging, of course, across these process boundaries can be a real challenge."

### What is the "at least once" delivery guarantee in messaging?

- [ ] Messages are guaranteed to be delivered exactly once.
- [x] Messages are guaranteed to be delivered at least once, meaning duplicates are possible and must be handled by the receiver.
- [ ] Messages are delivered only if the receiver is online.
- [ ] Messages are delivered only if the sender receives an acknowledgment.

**Rationale:** The text states: "And the other thing is, we have at least once delivery. So we know that every message is delivered at least once, but it might be delivered more than once. So we have to be able to deal with duplicates."

### What is the "exactly once" delivery guarantee, and why is it difficult to achieve?

- [ ] It is easily achieved by all messaging systems.
- [x] It guarantees that a message is delivered and processed exactly one time, but it is very difficult to achieve and often requires complex mechanisms like two-phase commit.
- [ ] It means messages are delivered only once, but not necessarily processed.
- [ ] It is a theoretical concept that has no practical application.

**Rationale:** The text states: "And the other thing is, we have exactly once delivery. That means a message is delivered and processed exactly one time. That's very difficult to achieve. You need something like two-phase commit or something like that."

### What is the challenge of "semantic differences" in messaging?

- [ ] It refers to the different programming languages used by applications.
- [x] It refers to the different interpretations of the same message by different applications, even if the syntax is correct.
- [ ] It refers to the physical location of the message brokers.
- [ ] It refers to the speed at which messages are processed.

**Rationale:** The text states: "And the other thing is semantic differences. So even if the syntax is correct, the meaning of the message might be different for different applications."

### What is a primary benefit of using messaging software for integrating legacy or external systems?

- [ ] It forces all systems to adopt a single, unified technology stack.
- [ ] It eliminates the need for any data transformation between systems.
- [x] It allows systems with different technical fits and levels of abstraction to communicate effectively.
- [ ] It automatically resolves all semantic differences between systems.

**Rationale:** The text states, "They have been developed independently of each other. They don't really have a good technical fit and there are different levels of abstractions in these three pieces of software. So how can we address this? We can do this using message orange and middleware."

### What is the purpose of "Enrichment" in the context of message processing for integration?

- [ ] To make the message smaller for faster transfer.
- [ ] To encrypt the message for security purposes.
- [x] To add missing information to a message (e.g., full customer details from an ID) so the receiving system has all necessary context.
- [ ] To remove sensitive data from the message before sending.

**Rationale:** The text explains, "So why do you need to enrich message? Well, in this case, the Yard Planning System has an internal customer ID, for example... So you have to enrich the message with the information about the customer from the Yard Planning System. So you pull everything up and put it directly into a message, and then the message is complete."

### What is the role of "Conversion" in the message processing example?

- [ ] To convert the message into a human-readable format.
- [x] To transform the message into a format that the receiving system can understand and process.
- [ ] To convert the message from an asynchronous to a synchronous format.
- [ ] To convert the message into a different language.

**Rationale:** The text describes it: "Then it's converted into Sparks Forward. So Sparks is a Vessel Planning System Forward, and only Sparks messages can be read by the Vessel Planning System."

### Into which six different groups do these message integration patterns primarily fall?

- [ ] Security, Performance, Scalability, Reliability, Usability, and Maintainability.
- [x] Message construction, Routing, Message transformation, System management, Messaging channels, and Endpoints.
- [ ] Data transfer, Remote procedure calls, Shared databases, File transfer, APIs, and Webhooks.
- [ ] Front-end, Back-end, Database, Network, Cloud, and On-premise.

**Rationale:** The text lists the groups: "And you'll see they basically fall into six different groups. So first is message construction, then it's routing, message transformation, and then their system management. So you can basically look what's going through those pipes. Then of course, there's the pipes themselves, so the messaging challenge. And of course, you have these endpoints that these applications have to have so they can."

### What is the purpose of a "Message Router" in the context of message integration?

- [ ] To convert message formats.
- [x] To direct messages to the correct recipient based on certain criteria.
- [ ] To add missing information to a message.
- [ ] To store messages persistently.

**Rationale:** The text implies this by showing the "Message Router" symbol directing messages to different systems.

### What is the role of a "Message Filter" in message integration?

- [ ] To change the content of a message.
- [x] To select messages based on certain criteria, allowing only relevant messages to pass through.
- [ ] To combine multiple messages into one.
- [ ] To ensure messages are delivered in a specific order.

**Rationale:** The text implies this by showing the "Message Filter" symbol, which typically filters messages based on content.

### What is the primary challenge when integrating systems that have different technical fits and levels of abstraction?

- [ ] They cannot be integrated at all.
- [x] They require a robust integration mechanism like message-oriented middleware to bridge these differences.
- [ ] They can only be integrated using file transfer.
- [ ] They must be completely rewritten to match.

**Rationale:** The text states: "They have been developed independently of each other. They don't really have a good technical fit and there are different levels of abstractions in these three pieces of software. So how can we address this? We can do this using message orange and middleware."

### What is a general challenge associated with distributed systems, regardless of the integration method used?

- [ ] Reduced complexity due to separation of concerns.
- [x] Increased complexity, extra overhead from remote calls, and more error sources.
- [ ] Simplified debugging across system boundaries.
- [ ] Elimination of all concurrency problems.

**Rationale:** The text states, "In general, you have extra overhead induced by remote calls... That's in general increased complexity. We talked about debugging across system boundaries. What about the errors? How do you know about them? How do they get transported? All these things, that's all extra stuff you have to think about... The error handling has to somehow transcend system barriers. Of course, the number of error sources themselves increase..."

### Which of the following are common challenges when dealing specifically with legacy systems?

- [x] They are often monolithic, making it hard to extract specific parts.
- [ ] They always come with comprehensive source code and documentation.
- [x] Suboptimal error handling and potentially bad data quality.
- [ ] They are always optimized for modern user interfaces.
- [x] Difficulties with transaction monitoring across new and old systems.

**Rationale:** The text lists several challenges: "First of all, in most cases, they're monolithic systems... There might be no source code, no documentation... Error handling, exception handling, might be suboptimal... The data quality might be bad... transaction monitoring might be difficult."

### What is the first question an architect should ask when considering distribution in a system?

- [ ] Which messaging middleware should be used?
- [ ] How many servers will be needed?
- [x] Can distribution be avoided altogether?
- [ ] What is the fastest network protocol available?

**Rationale:** The text advises, "The first thing to think about is, can distribution be avoided? And that, of course, would do away with all the problems you have with distribution, can it be avoided?"

### When dealing with legacy software, what is a crucial piece of advice regarding changes?

- [ ] Refactor the entire legacy system to modern standards immediately.
- [ ] Make as many invasive changes as possible to improve its performance.
- [x] Identify what is valuable (data, routines) and make changes as minimally invasive as possible, especially if source code or documentation is missing.
- [ ] Discard the legacy system without trying to extract any valuable parts.

**Rationale:** The text suggests, "what do I care about in this piece of legacy software? Is it data? Is it some computational routines? Is it a mixture of both? But once you find out, shut everything off that you can that doesn't pertain to those things you want to say and make those changes as minimally as invasive as possible, because you don't have the source code, you don't have the documentation, there's no one you can ask about these things. Be very careful what you do."

### Under what circumstances should a legacy system be shut down after migrating valuable parts?

- [ ] Only if it is completely unusable.
- [ ] If it is too expensive to upgrade to the latest technology.
- [x] If the risks or costs involved in maintaining it outweigh the business value derived from it.
- [ ] If a new system is available, regardless of the legacy system's value.

**Rationale:** The text advises, "If you find out at some point that the risks or the costs that are involved with maintaining this are higher than the business value you're deriving from this or keeping this around, then take the decision this is not worth it... then shut it down, try to save the parts that are valuable to you."

### What are some of the increased complexities and overheads associated with distributed systems?

- [x] Extra overhead induced by remote calls.
- [x] Increased complexity in general.
- [x] Challenges with debugging across system boundaries.
- [x] Increased number of error sources.
- [ ] Simplified error handling.
- [ ] Reduced need for communication between teams.

**Rationale:** The text states: "In general, you have extra overhead induced by remote calls... That's in general increased complexity. We talked about debugging across system boundaries. What about the errors? How do you know about them? How do they get transported? All these things, that's all extra stuff you have to think about... The error handling has to somehow transcend system barriers. Of course, the number of error sources themselves increase..."

### What is a common characteristic of legacy systems that makes integration challenging?

- [ ] They are always well-documented and have clean code.
- [x] They are often monolithic, making it difficult to extract specific parts for integration.
- [ ] They are designed with modern APIs for easy communication.
- [ ] They always have perfect data quality.

**Rationale:** The text states: "First of all, in most cases, they're monolithic systems. So it's very difficult to extract just one part of it."

### What is the primary advice for dealing with legacy systems when source code or documentation is missing?

- [ ] Rewrite the entire system from scratch.
- [x] Make changes as minimally invasive as possible, focusing on extracting valuable data or routines.
- [ ] Assume the system is perfect and make no changes.
- [ ] Hire a large team to reverse engineer the entire system.

**Rationale:** The text advises: "make those changes as minimally as invasive as possible, because you don't have the source code, you don't have the documentation, there's no one you can ask about these things. Be very careful what you do."

### What is the primary reason for the existence of Service-Oriented Architecture (SOA), according to the text?

- [ ] To solve purely technical problems related to system performance.
- [x] To address a business problem: the need for flexible reuse of existing monolithic systems to react to market pressures.
- [ ] To enable greenfield development without any legacy constraints.
- [ ] To reduce IT budgets by eliminating the need for new features.

**Rationale:** The text states, "the main reason is a business problem... The challenge is, you need to have something that you can reuse the old existing systems but in a flexible way so you can react to these market pressures and market conditions and what the competition is doing. And that is the reason why service-oriented architecture is existing. It's a business mechanism."

### Which of the following are key characteristics of services in a Service-Oriented Architecture?

- [ ] They are tightly coupled and managed centrally.
- [x] They are designed as integral units, loosely coupled, independently operated, managed, and maintained.
- [ ] They expose their internal implementation details to all consumers.
- [ ] They are accessed exclusively through proprietary, non-standard protocols.

**Rationale:** The text describes services as: "These services are designed as integral units, they're loosely coupled, they're independently operated, managed and maintained, and they're encapsulated..."

### Which of the following are key characteristics of services in SOA? (Select all that apply)

- [x] Designed as integral units
- [x] Loosely coupled
- [x] Independently operated
- [x] Independently managed and maintained
- [x] Encapsulated
- [ ] Tightly coupled
- [ ] Centrally managed

**Rationale:** The text describes services as: "These services are designed as integral units, they're loosely coupled, they're independently operated, managed and maintained, and they're encapsulated..." This format allows assessment of understanding of each individual SOA service characteristic.

### How do services in SOA typically expose their functionality to consumers?

- [ ] By allowing direct database access to their internal data.
- [ ] Through old, host-specific integration methods.
- [x] Using modern open standards like JSON, XML, SOAP, and HTTP, with a service contract describing the functionality.
- [ ] By providing a graphical user interface for direct interaction.

**Rationale:** The text explains, "And that interface provides a service contract that precisely describes what's going on behind that curtain. And these services are accessed using remote calls, using any modern standard, so it's not... they're using these modern open standards, so JSON, XML, SOAP and web service description languages, HTTP, all that, that is used on the outside..."

### What is the role of a "Service Directory" in SOA?

- [ ] It acts as a central broker for all service calls.
- [x] It serves as a repository where service providers publish their metadata, allowing service consumers to discover available services.
- [ ] It directly implements the business logic of the services.
- [ ] It monitors the performance of all services in real-time.

**Rationale:** The text describes it: "you submit that to a service directory and say, well, so if someone wants to have a tariff calculation, here, I can provide that service... And the service directory says, great, thank you very much for submitting that information to me, it's just like yellow pages basically, right? So everything is submitted there and sits in that repository..."

### How does the interaction between a service consumer and a service provider differ in SOA compared to the Broker pattern?

- [ ] In SOA, the service directory always mediates every call between consumer and provider.
- [ ] In the Broker pattern, there is no direct communication between consumer and provider.
- [x] In SOA, the service directory only makes the initial connection, after which there is direct communication between the consumer and provider, unlike the Broker pattern where the broker is always in the middle.
- [ ] The Broker pattern is a more modern approach than SOA for service discovery.

**Rationale:** The text clarifies: "So this might remind you of the broker pattern, but it's fundamentally different because the broker pattern had the broker always in the middle... And here, the service directory is just making the initial connection, and then everyone just goes through that direct connection."

### What is the primary purpose of the "service contract" in SOA?

- [ ] To define the internal implementation details of the service.
- [x] To precisely describe the functionality offered by the service's interface.
- [ ] To specify the programming language used by the service.
- [ ] To manage the deployment of the service.

**Rationale:** The text states: "And that interface provides a service contract that precisely describes what's going on behind that curtain."

### What is the relationship between SOA and monolithic systems?

- [ ] SOA completely replaces monolithic systems.
- [x] SOA aims to reuse existing monolithic systems in a flexible way.
- [ ] SOA is a type of monolithic system.
- [ ] Monolithic systems cannot be integrated with SOA.

**Rationale:** The text states: "The challenge is, you need to have something that you can reuse the old existing systems but in a flexible way so you can react to these market pressures and market conditions and what the competition is doing. And that is the reason why service-oriented architecture is existing."

### What is the role of "encapsulation" in SOA services?

- [ ] Services expose all their internal details.
- [x] Services hide their internal implementation details from consumers.
- [ ] Encapsulation is not a characteristic of SOA services.
- [ ] Services only encapsulate data, not behavior.

**Rationale:** The text states: "These services are designed as integral units, they're loosely coupled, they're independently operated, managed and maintained, and they're encapsulated."

### What is the primary distinction between intentional and unintentional coupling in software systems?

- [ ] Intentional coupling is always good, and unintentional coupling is always bad.
- [x] Intentional coupling is a conscious design choice, while unintentional coupling often causes problems because it's unexpected and not thought about.
- [ ] Unintentional coupling is easier to fix than intentional coupling.
- [ ] Intentional coupling only occurs in monolithic systems.

**Rationale:** The text states: "Of course, coupling can happen intentionally or can happen unintentionally, and especially the unintentional things are the ones that probably cause problems. Let's take a look at those. Some of them might be not only unintentional, but also something that you didn't even think about before."

### What is a "time-related dependency" in the context of service coupling?

- [ ] When services communicate only at specific times of the day.
- [x] When an application relies on another system being available outside its maintenance window, leading to issues if the other system is in a different time zone or undergoing maintenance.
- [ ] When services are synchronized using a global clock.
- [ ] When the performance of a service is dependent on the time of day.

**Rationale:** The text explains: "If you're using another system or accessing another system, that's in your same time zone, that's fine, no issues with that. But of course, you may be communicating with a system that's maintained by a shipping agent in Singapore. It's midnight in Singapore, and you're still up and working, but that system goes down because it's in its maintenance window, so you have to think about these things, when is that happening, and of course, if the service isn't there, then you cannot depend on it, so you're coupled to it in a way that's time-related."

### What is a "local dependency" and how can it be avoided?

- [ ] When an application relies on a local file system.
- [x] When an application uses a specific address (e.g., IP address) to access a service, and this address changes, it can be avoided by using DNS or similar mechanisms.
- [ ] When an application is deployed on a local server.
- [ ] When an application is dependent on local user input.

**Rationale:** The text states: "You are using a specific address to make use of that service, for example, a certain IP address or certain code, and suddenly that system is gone... Of course, if you use DNS or things like that, then you can avoid these things, but you have to think about that specific address, and if that is not there anymore, then you have a local dependency."

### What is an "implementation dependency" or "structural dependency" in the context of service coupling?

- [ ] When a service relies on a specific programming language.
- [x] When an application bypasses an official interface to use an unofficial or internal implementation detail of another service, leading to breakage if the internal implementation changes.
- [ ] When a service is dependent on a specific hardware architecture.
- [ ] When a service relies on a specific data structure for its public interface.

**Rationale:** The text describes: "if you want to be clever, so to speak, then you may sneak away around the new black box and somehow tap the old software that's in there... if they change the way it's implemented or something is turned off or switched to a computer, suddenly that functionality isn't there anymore. You went around the official interface at your own risk, and now it's not there anymore, so you had some structural or implementation dependencies in your code."

### What is a "data dependency" in the context of service coupling?

- [ ] When an application relies on a specific data format for its public interface.
- [x] When an application makes assumptions about the format or content of data received from another service (e.g., expecting a numerical ID to always be numerical), leading to breakage if the format changes.
- [ ] When an application stores its data in a shared database.
- [ ] When an application is dependent on the availability of external data sources.

**Rationale:** The text explains: "For example, you're using some data structure of another service, and you always get that with a certain ID in a certain form. You say, well, it's always numerical, and these first eight digits that I'm getting from that, I can use that as a database key for my article number, for example. That goes fine as long as no one changes it, but then suddenly there's a merger or something else is going on in that other software, and you're getting that key, not as an numerical key, but as some alphanumeric key suddenly... then that breaks your code because you had a data dependency in your code."

### Which scenario best demonstrates a time zone-related service coupling issue?

- [ ] Two services in the same data center communicating during business hours.
- [x] An application in New York depending on a service maintained in Singapore that goes offline for maintenance at midnight Singapore time (1 PM New York time).
- [ ] Services using different timestamp formats for logging.
- [ ] An application that performs better during off-peak hours.

**Rationale:** The text specifically mentions: "But of course, you may be communicating with a system that's maintained by a shipping agent in Singapore. It's midnight in Singapore, and you're still up and working, but that system goes down because it's in its maintenance window." This illustrates how time zone differences can create unexpected coupling issues.

### What is the primary risk of making format assumptions about data from external services?

- [ ] Increased network latency when processing the data.
- [ ] Higher memory usage due to data validation.
- [x] Application breakage when the external service changes its data format (e.g., from numerical to alphanumeric IDs).
- [ ] Reduced security due to data exposure.

**Rationale:** The text provides a specific example: "You say, well, it's always numerical, and these first eight digits that I'm getting from that, I can use that as a database key for my article number... but then suddenly there's a merger or something else is going on in that other software, and you're getting that key, not as an numerical key, but as some alphanumeric key suddenly... then that breaks your code because you had a data dependency in your code."

### What is the defining characteristic of a "Peer-to-Peer" cooperation type?

- [ ] There is a central server that controls all communication.
- [x] All participants are directly connected as equal peers, and any peer can act as either a client or a server.
- [ ] Communication always flows in one direction, from client to server.
- [ ] Resources are never shared between peers.

**Rationale:** The text states, "They're directly connected as equal peers, and every peer can either be a client or a server, depending on what's required."

### Which of the following are advantages of a Peer-to-Peer network?

- [ ] It is always easy to find a specific peer in a very large network.
- [x] High reliability and the ability to share resources like CPU time and storage.
- [ ] It guarantees that all replies from peers are always correct.
- [ ] It simplifies error handling by centralizing it.

**Rationale:** The text lists advantages: "The advantage is high reliability, and you can share resources. So CPU, time, storage, anything like that."

### What is a significant challenge in a large Peer-to-Peer network?

- [ ] Ensuring that all peers have identical hardware.
- [x] Finding the specific peer you are looking for, requiring complex routing algorithms.
- [ ] Preventing any peer from ever malfunctioning.
- [ ] Limiting the number of resources that can be shared.

**Rationale:** The text mentions, "The drawback is, if it's a very big network, it might be a challenge to find the peer you're looking for. Think about the Internet again. There are millions of nodes. How do you figure out where that peer that you're looking for is?"

### What is the central concept of the "Blackboard" cooperation type?

- [ ] A system where all processing is done by a single, central component.
- [x] A central repository where knowledge is stored, and independent external knowledge sources contribute and retrieve information.
- [ ] A peer-to-peer network where all nodes have identical responsibilities.
- [ ] A system that only processes data in a sequential manner.

**Rationale:** The text describes it: "the ideas, there's one central repository where everything that you know about is stored, and you have these external knowledge sources that independently try to investigate something, and they bring the results together on this big blackboard."

### What is a major disadvantage of the Blackboard cooperation type?

- [ ] It is only suitable for very small amounts of data.
- [ ] It prevents external knowledge sources from working in parallel.
- [x] It requires a commitment to one common data model, which can be challenging to agree upon among multiple experts.
- [ ] It simplifies debugging and testing across different knowledge sources.

**Rationale:** The text states, "The drawback, of course, you have to commit to one common data model, and, of course, you know, the more experts you have, the more opinions you have about how things should be done, so finding one common data model can be a challenge."

### What is the primary characteristic of a "Client-Server" cooperation type?

- [ ] All participants are equal peers.
- [x] There is a clear distinction between clients (requesting services) and servers (providing services).
- [ ] Communication is always asynchronous.
- [ ] Resources are shared directly between clients.

**Rationale:** The text implies this by contrasting it with Peer-to-Peer: "The first one is client-server. So you have a client, you have a server, and the client is asking for something, and the server is providing something."

### What is a key advantage of the Client-Server cooperation type?

- [ ] It allows for direct resource sharing between clients.
- [x] It simplifies management and security by centralizing services on the server.
- [ ] It eliminates the need for network infrastructure.
- [ ] It ensures all clients have identical functionality.

**Rationale:** The text implies this by contrasting it with Peer-to-Peer's challenges: "The drawback is, if it's a very big network, it might be a challenge to find the peer you're looking for." Client-server centralizes this.

### What is the primary advantage of the Blackboard cooperation type?

- [ ] It simplifies the data model.
- [x] It allows independent knowledge sources to contribute and retrieve information, facilitating complex problem-solving.
- [ ] It ensures all knowledge sources are tightly coupled.
- [ ] It eliminates the need for any central repository.

**Rationale:** The text describes it: "the ideas, there's one central repository where everything that you know about is stored, and you have these external knowledge sources that independently try to investigate something, and they bring the results together on this big blackboard."

### What is a common fallacy or mistake that the speaker warns against when dealing with cross-cutting concerns?

- [ ] Assuming that all cross-cutting concerns are independent and can be handled by separate, isolated teams.
- [x] Working on cross-cutting concerns like persistence, communication, and GUI in isolation, assuming they don't interleave.
- [ ] Prioritizing security over logging in all cases.
- [ ] Believing that cross-cutting concerns are not important for software architecture.

**Rationale:** The text states, "This fallacy, I've seen this quite often, is you work on persistence, you work on communications, you work on concurrency, you work on the Graphical User Interface, and so on. So split teams or split jobs for each of these cross-cutting concerns, and that's big red flag or a mistake, because some of these things actually don't work apart, but they work together in one form or another."

### What example is used to illustrate the danger of treating cross-cutting concerns in isolation?

- [ ] A system where the GUI is not responsive due to poor concurrency.
- [x] A banking system where security is strong, but unencrypted sensitive data appears in log files because logging was handled by a separate, isolated team.
- [ ] A communication system that fails due to incorrect persistence.
- [ ] A system that is difficult to maintain because of a complex GUI.

**Rationale:** The text provides this example: "Let me pick security and logging... all the focus is on security and the main application, but the log files might not be encrypted at all. So all these account numbers or routing numbers or even passwords or pins or you name it, might appear in the log file unencrypted, and that's a big issue, of course."

### What is the recommended approach when dealing with cross-cutting concerns that interleave with each other?

- [ ] Ignore the interleaving and hope for the best.
- [ ] Deal with them later in the development process, as it's always cheaper.
- [x] Figure out the touching points first and deal with them early, as addressing them later is more expensive and problematic.
- [ ] Assign them to different teams to promote specialization.

**Rationale:** The text advises, "So figure that out first, and if you figure out there's no touching points, that's great, then you can work independently of each other. But if there are touching points, deal with them first, because if you don't deal with them first, then you have to deal with them later, and later is always more expensive and brings more problems..."

### What is a potential benefit of finding good solutions for technical concepts like logging or error handling?

- [ ] They are always unique to each system and cannot be reused.
- [x] They can often be reused across different systems.
- [ ] They eliminate the need for any further architectural design.
- [ ] They only apply to the specific programming language they were written in.

**Rationale:** The text mentions, "And once you've settled all these things, then of course, many of these technical concepts can be reused across systems. So if you found a good logging solution or a good error handling solution, then you'll be probably able to use that in a different system."

### What is the primary characteristic of "cross-cutting concerns"?

- [ ] They are isolated functionalities that affect only one part of the system.
- [x] They are concerns that affect multiple parts of the system and often interleave with each other.
- [ ] They are only relevant for very small projects.
- [ ] They are always handled by a single, dedicated team.

**Rationale:** The text implies this by discussing how they "interleave" and how working on them in isolation is a "fallacy."

### What is the consequence of ignoring the interleaving nature of cross-cutting concerns?

- [ ] It leads to a more modular and maintainable system.
- [x] It can lead to significant problems and increased costs later in the development process.
- [ ] It simplifies the overall architectural design.
- [ ] It has no impact on the system's quality.

**Rationale:** The text states: "But if there are touching points, deal with them first, because if you don't deal with them first, then you have to deal with them later, and later is always more expensive and brings more problems."

### What is the most widely used type of database for most applications, despite the emergence of newer paradigms?

- [ ] Hierarchical databases.
- [ ] Network databases.
- [x] Relational databases.
- [ ] Object-oriented databases.

**Rationale:** The text states, "And the workhorse of most applications still is a relational database."

### What is the main challenge when using relational databases with object-oriented programming languages?

- [ ] Relational databases are too slow for object-oriented applications.
- [ ] Relational databases do not support SQL.
- [x] There is an impedance mismatch, requiring mapping software to bridge the gap between object structures and relational database structures.
- [ ] Object-oriented languages cannot connect to relational databases.

**Rationale:** The text explains, "So while they were fine with COBOL or things like that, if you have object-oriented languages like Java or C sharp or C++, there's no perfect match between those two. So you have to have some kind of mapping software that maps your object structure to those relational database structures."

### What is the primary goal of object-oriented databases?

- [ ] To replace all relational databases with a new, more efficient model.
- [x] To seamlessly integrate with object-oriented programming languages by making the boundary between in-memory objects and persistent storage transparent.
- [ ] To store data in a hierarchical structure.
- [ ] To provide a key-value store for unstructured data.

**Rationale:** The text describes them: "So you try to somehow get around that break, so to speak. And the idea is that you basically have one big, endless memory. And you don't really know what object is still in memory or what is out."

### For what type of data structure are "Graph Databases" particularly well-suited?

- [ ] Simple key-value pairs.
- [ ] Highly structured tabular data.
- [x] Networks, such as power grids, social networks, or navigation data.
- [ ] Unstructured documents like tweets or articles.

**Rationale:** The text states, "So it could be a power grid, or it could be for suite navigation, or it could be social networks, anything like that. So there you have graphs. And the graph, of course, is a very special form of an object structure. And of course, you can use relational databases or object databases to handle all these. But why not use a specialized database to do this? And these graph databases are very good to map those things."

### What is a key characteristic of "Document-Oriented Databases" that makes them suitable for data like tweets?

- [ ] They enforce strict relational integrity between all stored documents.
- [ ] They require all data to be stored in a flat, non-nested structure.
- [x] They allow for storing semi-structured data (like JSON, XML) within a document, and references (like hashtags) can exist even if the referenced item doesn't yet, without invalidating the document.
- [ ] They are primarily designed for high-performance transactional processing.

**Rationale:** The text explains, "So you have an address for the tweet, just the number, and inside the tweet you would have text and you would have hashtags and maybe handles and pictures or videos or links. So all kinds of structures inside the document... And the great thing about is that thing is that you can reference things that don't even exist yet. You can make up a new hashtag, you can reference a handle that doesn't exist anymore, but that doesn't invalidate your tweet."

### What is the primary purpose of "mapping software" when using relational databases with object-oriented languages?

- [ ] To convert relational data into a different format for display.
- [x] To bridge the impedance mismatch between object structures and relational database structures.
- [ ] To optimize SQL queries for performance.
- [ ] To provide a graphical user interface for database management.

**Rationale:** The text states: "So you have to have some kind of mapping software that maps your object structure to those relational database structures."

### What is the core idea behind "Key-Value Stores"?

- [ ] To store data in a highly structured, relational format.
- [x] To store data as a simple key-value pair, where the key is unique and the value can be anything.
- [ ] To provide complex querying capabilities across multiple tables.
- [ ] To enforce strict data types for all stored values.

**Rationale:** The text states: "The simplest form of a database is a key-value store. So you have a key, and that key is unique, and you have a value, and that value can be anything."

### For what type of data are "Column-Oriented Databases" particularly well-suited?

- [ ] Transactional data with frequent updates.
- [x] Data that is primarily read and analyzed, such as for business intelligence or data warehousing.
- [ ] Unstructured document data.
- [ ] Graph data with complex relationships.

**Rationale:** The text states: "So if you have a lot of data that you want to analyze, so business intelligence, data warehousing, things like that, then column-oriented databases are very good for that."

### What is the primary advantage of using a specialized database (like a Graph Database for graph data) instead of a general-purpose one?

- [ ] Specialized databases are always cheaper.
- [x] They are optimized for specific data structures and access patterns, leading to better performance and easier mapping.
- [ ] They eliminate the need for any data modeling.
- [ ] They can store any type of data more efficiently.

**Rationale:** The text states: "And of course, you can use relational databases or object databases to handle all these. But why not use a specialized database to do this? And these graph databases are very good to map those things."

### What is the most widely used type of database for most applications, despite the emergence of newer paradigms?

- [ ] Hierarchical databases.
- [ ] Network databases.
- [x] Relational databases.
- [ ] Object-oriented databases.

**Rationale:** The text states, "And the workhorse of most applications still is a relational database."

### What is the main challenge when using relational databases with object-oriented programming languages?

- [ ] Relational databases are too slow for object-oriented applications.
- [ ] Relational databases do not support SQL.

**Rationale:** The text explains, "So while they were fine with COBOL or things like that, if you have object-oriented languages like Java or C sharp or C++, there's no perfect match between those two. So you have to have some kind of mapping software that maps your object structure to those relational database structures."

### What is the primary goal of object-oriented databases?

- [ ] To replace all relational databases with a new, more efficient model.
- [x] To seamlessly integrate with object-oriented programming languages by making the boundary between in-memory objects and persistent storage transparent.
- [ ] To store data in a hierarchical structure.
- [ ] To provide a key-value store for unstructured data.

**Rationale:** The text describes them: "So you try to somehow get around that break, so to speak. And the idea is that you basically have one big, endless memory. And you don't really know what object is still in memory or what is out."

### For what type of data structure are "Graph Databases" particularly well-suited?

- [ ] Simple key-value pairs.
- [ ] Highly structured tabular data.
- [x] Networks, such as power grids, social networks, or navigation data.
- [ ] Unstructured documents like tweets or articles.

**Rationale:** The text states, "So it could be a power grid, or it could be for suite navigation, or it could be social networks, anything like that. So there you have graphs. And the graph, of course, is a very special form of an object structure. And of course, you can use relational databases or object databases to handle all these. But why not use a specialized database to do this? And these graph databases are very good to map those things."

### What is a key characteristic of "Document-Oriented Databases" that makes them suitable for data like tweets?

- [ ] They enforce strict relational integrity between all stored documents.
- [ ] They require all data to be stored in a flat, non-nested structure.
- [x] They allow for storing semi-structured data (like JSON, XML) within a document, and references (like hashtags) can exist even if the referenced item doesn't yet, without invalidating the document.
- [ ] They are primarily designed for high-performance transactional processing.

**Rationale:** The text explains, "So you have an address for the tweet, just the number, and inside the tweet you would have text and you would have hashtags and maybe handles and pictures or videos or links. So all kinds of structures inside the document... And the great thing about is that thing is that you can reference things that don't even exist yet. You can make up a new hashtag, you can reference a handle that doesn't exist anymore, but that doesn't invalidate your tweet."

### What is the primary purpose of "mapping software" when using relational databases with object-oriented languages?

- [ ] To convert relational data into a different format for display.
- [x] To bridge the impedance mismatch between object structures and relational database structures.
- [ ] To optimize SQL queries for performance.
- [ ] To provide a graphical user interface for database management.

**Rationale:** The text states: "So you have to have some kind of mapping software that maps your object structure to those relational database structures."

### What is the core idea behind "Key-Value Stores"?

- [ ] To store data in a highly structured, relational format.
- [x] To store data as a simple key-value pair, where the key is unique and the value can be anything.
- [ ] To provide complex querying capabilities across multiple tables.
- [ ] To enforce strict data types for all stored values.

**Rationale:** The text states: "The simplest form of a database is a key-value store. So you have a key, and that key is unique, and you have a value, and that value can be anything."

### For what type of data are "Column-Oriented Databases" particularly well-suited?

- [ ] Transactional data with frequent updates.
- [x] Data that is primarily read and analyzed, such as for business intelligence or data warehousing.
- [ ] Unstructured document data.
- [ ] Graph data with complex relationships.

**Rationale:** The text states: "So if you have a lot of data that you want to analyze, so business intelligence, data warehousing, things like that, then column-oriented databases are very good for that."

### What is the primary advantage of using a specialized database (like a Graph Database for graph data) instead of a general-purpose one?

- [ ] Specialized databases are always cheaper.
- [x] They are optimized for specific data structures and access patterns, leading to better performance and easier mapping.
- [ ] They eliminate the need for any data modeling.
- [ ] They can store any type of data more efficiently.

**Rationale:** The text states: "And of course, you can use relational databases or object databases to handle all these. But why not use a specialized database to do this? And these graph databases are very good to map those things."

### What are the three different styles of communication discussed in the text?

- [ ] Email, Phone Call, and Text Message.
- [x] Remote Procedure Call, Publish/Subscribe, and Broadcast.
- [ ] Synchronous, Asynchronous, and Batch.
- [ ] Client-Server, Peer-to-Peer, and Centralized.

**Rationale:** The text explicitly lists them: "So these are the three mechanisms, remote procedure call, public subscribe and broadcast."

### What is the primary characteristic of a "Remote Procedure Call" (RPC) communication style?

- [ ] It is an asynchronous, fire-and-forget mechanism.
- [x] It involves making a call to a different entity and expecting a direct reply back, similar to a local function call.
- [ ] It notifies all interested parties about an event without knowing who they are.
- [ ] It is primarily used for one-way data transfer.

**Rationale:** The text describes it as: "So you make a call to a different entity or some other unit in your program and you get a reply back."

### What is the core concept of the "Publish/Subscribe" communication style?

- [ ] A direct, one-to-one communication between two known entities.
- [x] Entities express interest in specific events or topics and are notified only when those events occur.
- [ ] Sending a message to a single, predefined recipient.
- [ ] Continuously polling a server for updates.

**Rationale:** The text explains, "So you know what you care about... you pre-define that trigger and say, so if this and this happens, then I want to be notified. Otherwise, don't tell me, I don't care about being pinged all the time, just tell me if the thing that I'm looking for is happening."

### What is the main characteristic of the "Broadcast" communication style?

- [ ] It requires prior registration of all recipients.
- [ ] It is a highly targeted, point-to-point communication.
- [x] It involves notifying anyone who is listening about your presence or an event, without knowing who the recipients are or if they will react.
- [ ] It is primarily used for secure, encrypted data exchange.

**Rationale:** The text uses the ice cream truck analogy: "But in some cases, you don't know who you want to reach or who's even out there and who can do something for you... So with broadcasting and doing this ringing the bell thing, you can just notify anyone or tell others about your presence and then they can decide, do I want to react on this yes or no..."

### Which communication style is best suited for an unplanned, spontaneous interaction where the sender doesn't know the recipients?

- [ ] Remote Procedure Call
- [ ] Publish/Subscribe
- [x] Broadcast
- [ ] Point-to-Point Messaging

**Rationale:** The text describes Broadcast as: "So it's an unplanned spontaneous interaction that's happening."

### What is the primary difference between Publish/Subscribe and Broadcast communication styles?

- [ ] Publish/Subscribe is synchronous, while Broadcast is asynchronous.
- [x] Publish/Subscribe involves explicit registration of interest (subscribers), while Broadcast notifies anyone listening without prior knowledge of recipients.
- [ ] Broadcast is a more secure communication method.
- [ ] Publish/Subscribe is only used for internal system communication.

**Rationale:** The text describes Publish/Subscribe: "So you know what you care about... you pre-define that trigger and say, so if this and this happens, then I want to be notified." For Broadcast: "But in some cases, you don't know who you want to reach or who's even out there and who can do something for you... So with broadcasting and doing this ringing the bell thing, you can just notify anyone or tell others about your presence and then they can decide, do I want to react on this yes or no..."

### What are the two main questions to consider when designing a graphical user interface, according to the text?

- [ ] What programming language will be used, and who will develop it?
- [x] How does the user actually interact with the system, and who controls the navigation of the application?
- [ ] How much data will be displayed, and what colors will be used?
- [ ] What is the budget for the user interface, and when will it be completed?

**Rationale:** The text states, "Our main questions when designing this kind of interface is, how does the user actually interact with the system? ...And who controls the navigation of the application?"

### Which of the following is a characteristic of an "Object-Oriented" interaction style, as exemplified by a desktop environment?

- [ ] A sequential flow where the software controls the navigation.
- [x] Users interact with virtual objects (like files, folders, trash bins) that behave as if they were real things, allowing manipulation like dragging and dropping.
- [ ] Filling out forms with predefined fields.
- [ ] Navigating through a tree-like menu structure.

**Rationale:** The text describes it: "First one is object-oriented, and you know this from every desktop you're working with. You see folders, you see files... and you can pick one of these files or documents or whatever you have and pull them onto the printer to print them, or you drop them in the trash bin, but they're still there... So all these things are an object-oriented model, because all these things behave as if they were real things, and you can move them around, take them back to all these kinds of things."

### a What are the virtual objects typically found in an object-oriented desktop environment?

- [ ] Buttons, sliders, and checkboxes
- [x] Files, folders, and trash bins
- [ ] Windows, dialogs, and menus
- [ ] Icons, cursors, and toolbars

**Rationale:** The text specifically mentions these virtual objects: "You see folders, you see files... and you drop them in the trash bin." These are the primary virtual objects that users interact with in object-oriented desktop environments.

### b What makes virtual objects in an object-oriented interface feel "real" to users?

- [ ] They have realistic visual textures and shadows
- [x] They behave as if they were real physical things
- [ ] They make sounds when manipulated
- [ ] They have weight and physics simulations

**Rationale:** The text explains: "So all these things are an object-oriented model, because all these things behave as if they were real things." The key is behavioral similarity to physical objects, not visual realism.

### c Which manipulation technique is characteristic of object-oriented interfaces?

- [ ] Double-clicking to activate objects
- [x] Dragging and dropping objects between locations
- [ ] Right-clicking for context menus
- [ ] Keyboard shortcuts for object operations

**Rationale:** The text specifically describes this interaction: "you can pick one of these files or documents or whatever you have and pull them onto the printer to print them, or you drop them in the trash bin." Drag and drop is the fundamental manipulation technique mentioned for object-oriented interfaces.

### What type of interaction style is characterized by a sequential flow where the software controls the control flow, such as in an ATM or a wizard?

- [ ] Object-oriented
- [x] Question-answer
- [ ] Form-based
- [ ] Menu-driven

**Rationale:** The text explains, "Another style is question-answer. So there's a sequential flow, and the software actually is controlling the control flow. And you might think, well, what could this be? So for example, an ATM... or if you're working with an IDE, then if you trade a new project, you're entering a wizard..."

### What is the primary characteristic of a "Form-based" interaction style?

- [ ] Users manipulate virtual objects directly on the screen.
- [ ] The system asks a series of questions to guide the user.
- [x] It resembles a printed form where users fill out fields, with validation and feedback on missing or invalid information.
- [ ] Navigation is primarily through a hierarchical menu tree.

**Rationale:** The text describes it: "Oh yeah, formula-based, or form in general. It just looks like printed form, and that form, you fill out all the fields, and maybe some things need to be filled in, so they light up in red, so you know that some information is missing or is invalid..."

### Which interaction style is best suited for kiosks and involves navigating through a tree-like structure where users pick alternatives from offered options?

- [ ] Object-oriented
- [ ] Question-answer
- [ ] Form-based
- [x] Menus and Windows (Menu-driven)

**Rationale:** The text states, "and there's menus and windows, and that's, well, a tree-like structure, and you pick an alternative based on what you're offered, and you don't really see everything right away, you just have to go through the menu tree to figure out what you want to pick, and this is great for kiosks and things like that."

### What is the primary characteristic of a "Command Language" interaction style?

- [ ] Users interact with graphical elements.
- [x] Users type commands into a command line, requiring knowledge of the commands and their syntax.
- [ ] Users fill out forms.
- [ ] Users answer a series of questions.

**Rationale:** The text states: "And then there's command language. So you type in commands, and you have to know the commands, and you have to know the syntax of the commands."

### What is the primary characteristic of a "Natural Language" interaction style?

- [ ] Users interact with graphical elements.
- [x] Users communicate with the system using human language, which is difficult for the system to interpret due to ambiguity.
- [ ] Users fill out forms.
- [ ] Users answer a series of questions.

**Rationale:** The text states: "And then there's natural language. So you talk to the system, and the system tries to figure out what you want to do. And that's very difficult because natural language is very ambiguous."

### What is the primary characteristic of a "Direct Manipulation" interaction style?

- [ ] Users type commands into a command line.
- [x] Users directly manipulate graphical objects on the screen, receiving immediate feedback.
- [ ] Users fill out forms.
- [ ] Users answer a series of questions.

**Rationale:** The text states: "And then there's direct manipulation. So you manipulate objects directly on the screen, and you get immediate feedback."

### What is the primary characteristic of a "Fill-in-the-Blanks" interaction style?

- [ ] Users type commands into a command line.
- [ ] Users directly manipulate graphical objects on the screen.
- [x] Users fill in predefined fields, often with validation and feedback.
- [ ] Users answer a series of questions.

**Rationale:** The text states: "Oh yeah, formula-based, or form in general. It just looks like printed form, and that form, you fill out all the fields, and maybe some things need to be filled in, so they light up in red, so you know that some information is missing or is invalid..." This is synonymous with "Fill-in-the-Blanks".

### What is a common misconception about internationalization (I18N) that the text addresses?

- [ ] That it is only relevant for projects with a global reach.
- [x] That it is simply a matter of externalizing strings and having them translated.
- [ ] That it is a purely technical concern with no cultural implications.
- [ ] That it is always easy to implement and requires no special considerations.

**Rationale:** The text states, "And many people think, well, that's easy. Well, I just externalize the strings, let them have them translated, and I'm done. No, it's not as simple as that."

### Beyond text translation, which of the following are examples of internationalization challenges related to layout and display?

- [ ] Ensuring consistent font sizes across all languages.
- [x] Handling special characters and delivering appropriate fonts.
- [x] Mirroring the entire page layout for right-to-left languages like Arabic or Hebrew.
- [ ] Automatically adjusting image resolutions for different locales.

**Rationale:** The text mentions: "So you have a L with the stripe through and Polish and things like that. And these things don't appear in the normal lesson font. So you may have to think about, how do I deliver all these fonts? And the same goes for the layout or the text. So maybe you look at websites in Arabic or Hebrew and you might see there, yes, the language goes from right to left, that's fine, and also the layout is mirrored."

### Which of the following are examples of internationalization challenges related to fonts and character display?

- [x] Handling special characters (like Polish L with stripe)
- [x] Delivering appropriate fonts for language-specific characters
- [ ] Ensuring consistent font sizes across all languages
- [ ] Automatically adjusting image resolutions for different locales
- [ ] Using only standard ASCII characters
- [ ] Avoiding any special typography

**Rationale:** The text mentions: "So you have a L with the stripe through and Polish and things like that. And these things don't appear in the normal lesson font. So you may have to think about, how do I deliver all these fonts?" This format allows students to demonstrate understanding of each individual font and character challenge.

### Which of the following are layout challenges specific to right-to-left languages like Arabic or Hebrew?

- [x] Mirroring the entire page layout
- [x] Reversing text direction from right to left
- [x] Adjusting UI element positioning
- [ ] Using different color schemes
- [ ] Changing font sizes dramatically
- [ ] Removing images from the interface

**Rationale:** The text states: "So maybe you look at websites in Arabic or Hebrew and you might see there, yes, the language goes from right to left, that's fine, and also the layout is mirrored." This format allows assessment of understanding of each individual layout challenge for RTL languages.

### What is a key piece of advice for handling time zones in internationalized applications?

- [ ] Always store times in the user's local time zone.
- [ ] Ignore time zones and assume all users are in the same one.
- [x] Use Universal Time Coordinated (UTC) for storing times and translate to local time zones for display.
- [ ] Rely on the operating system to automatically manage all time zone conversions.

**Rationale:** The text advises, "Time zones, don't use local time... The best thing is to use UTC, universal time zone. And if you use that one, you're always safe and you can make a translation to the local time zone but don't store times in local time."

### What is a common pitfall when formatting numbers and currencies for different locales?

- [ ] Assuming that all countries use a dot as a decimal separator.
- [x] Assuming that all countries use the same decimal and thousands separators, or the same number of decimal places for currencies.
- [ ] Relying on a library for formatting, which is often incorrect.
- [ ] Ignoring currency symbols, as they are universally understood.

**Rationale:** The text gives examples of differences in number formatting (e.g., comma vs. dot, Indian numbering system) and currency (e.g., Kuwaiti Dinar with three decimal places), warning against assumptions: "If you use formatting... don't make any assumptions, don't make it on your own, you're probably wrong, rely on a library that you can use for formatting."

### Why should developers be cautious about using symbols and metaphors when internationalizing an application?

- [ ] They are always universally understood and can be used freely.
- [ ] They make the application more engaging for all users.
- [x] A symbol or metaphor that is normal or friendly in one culture might be offensive or misunderstood in another.
- [ ] They are difficult to translate into different languages.

**Rationale:** The text warns, "And I already mentioned symbols and metaphors. If you know you ship this to a country that's outside your cultural space, don't make any assumptions, stay away from those things, might get a bit boring but at least on the safe side and no one tries to sue you."

### What is the difference between internationalization (I18N) and localization (L10N)?

- [ ] I18N is about translating text, while L10N is about adapting to local customs.
- [x] I18N is the process of designing and developing a product so that it can be adapted to various languages and regions without engineering changes, while L10N is the actual adaptation for a specific locale.
- [ ] I18N is for software, and L10N is for hardware.
- [ ] There is no difference; the terms are interchangeable.

**Rationale:** The text implies this distinction by discussing the complexities of I18N beyond simple translation, which are then handled by localization.

### What is a specific challenge related to character sets and fonts in internationalization?

- [ ] All languages use the same 26-letter alphabet.
- [x] Handling special characters (e.g., L with a stripe through it in Polish) and delivering appropriate fonts that contain these characters.
- [ ] Fonts are universally available on all operating systems.
- [ ] Character sets only affect the display of numbers.

**Rationale:** The text states: "So you have a L with the stripe through and Polish and things like that. And these things don't appear in the normal lesson font. So you may have to think about, how do I deliver all these fonts?"

### What is the advice for handling number and currency formatting in internationalized applications?

- [ ] Manually implement formatting logic for each country.
- [x] Rely on a library for formatting, as manual implementation is prone to errors due to diverse regional conventions.
- [ ] Assume a single global standard for all numbers and currencies.
- [ ] Only display numbers and currencies as raw values without any formatting.

**Rationale:** The text states: "If you use formatting... don't make any assumptions, don't make it on your own, you're probably wrong, rely on a library that you can use for formatting."

### What is the primary reason to avoid making assumptions about cultural norms when designing for international audiences?

- [ ] It makes the design process faster.
- [x] A symbol or metaphor that is normal or friendly in one culture might be offensive or misunderstood in another.
- [ ] Cultural norms are universally understood.
- [ ] It simplifies the translation process.

**Rationale:** The text warns: "And I already mentioned symbols and metaphors. If you know you ship this to a country that's outside your cultural space, don't make any assumptions, stay away from those things, might get a bit boring but at least on the safe side and no one tries to sue you."

### What are the five security goals that a system should aim to achieve, as mentioned in the text?

- [ ] Speed, Efficiency, Scalability, Usability, and Cost-effectiveness.
- [x] Confidentiality, Integrity, Authenticity, Authorization, and Availability.
- [ ] Encryption, Decryption, Hashing, Digital Signatures, and Firewalls.
- [ ] Prevention, Detection, Response, Recovery, and Forensics.

**Rationale:** The text explicitly lists: "So the five security goals that you have to keep in mind. First is confidentiality. ...Such integrity. ...Authenticity. ...Authorization. ...Availability."

### Which of the following are the five security goals that a system should aim to achieve? (Select all that apply)

- [x] Confidentiality
- [x] Integrity
- [x] Authenticity
- [x] Authorization
- [x] Availability
- [ ] Scalability
- [ ] Performance
- [ ] Usability

**Rationale:** The text explicitly lists: "So the five security goals that you have to keep in mind. First is confidentiality. ...Such integrity. ...Authenticity. ...Authorization. ...Availability." This format allows students to demonstrate understanding of each individual security goal.

### What is the purpose of using an MD5 checksum when downloading software, in relation to security?

- [ ] To encrypt the software for secure storage.
- [ ] To verify the software's compatibility with the operating system.
- [x] To check the integrity of the downloaded file and detect if it has been tampered with during transfer.
- [ ] To authenticate the user who downloaded the software.

**Rationale:** The text explains, "For example, if you're downloading software, sometimes you see this MD5 checksum and they say, well, when we package this, we got this checksum. And when you download this and you get a different MD5 checksum, then someone has done something in the middle and be aware, don't unpack this, it's not the original thing."

### What is a critical piece of advice regarding implementing cryptographic procedures yourself?

- [ ] It is always recommended to implement your own cryptographic procedures for maximum security.
- [ ] Only implement them if you have a small team and can control the code.
- [x] Do not implement cryptographic procedures yourself; rely on established libraries and security companies, as it's an ongoing arms race.
- [ ] It is acceptable if you use a very old and well-known algorithm like Caesar cipher.

**Rationale:** The text strongly advises: "Don't implement a cryptographic procedure yourself... This is an arms race that's going on. And what most people know is years old. And in the meantime, many new things have happened. The new libraries, the new bugs, every few weeks, you cannot keep up with that unless you're a security company. Then do it. Otherwise, don't roll these yourself."

### Why is it generally not recommended to use self-signed certificates for public-facing websites?

- [ ] They are technically less secure than purchased certificates.
- [ ] They are too expensive to generate.
- [x] They cause pop-ups in browsers and irritate users, making them unsure if they can trust the site.
- [ ] They are only compatible with specific web browsers.

**Rationale:** The text explains, "If you use certificates, you have to decide, well, you can use your own certificates, but no one will know these. And they have all these pop-ups in the browsers. And they have to say, yes, I trust that thing. Internally, that's fine. But if you have a public-facing website, don't do it. People will get irritated. And we'll not be sure if they can trust your site if they have to manually do these things."

### At what OSI level should security measures ideally be implemented, and why?

- [ ] At the highest level (Application Layer) for maximum flexibility.
- [ ] At the middle layers (Session, Presentation) for balanced control.
- [x] At a low OSI level, deep down, to ensure robustness and prevent bypassing.
- [ ] It does not matter at which level security is implemented.

**Rationale:** The text advises, "If you implement the security measures, do it on low OSI level. So if you sugarcoat everything on top, that's great. But it has to be deep down there so no one can basically pull the rug from under your feet. Be safe on that front."

### What is "Confidentiality" in the context of security goals?

- [ ] Ensuring that data is accurate and complete.
- [x] Ensuring that only authorized people can read or access data.
- [ ] Verifying the identity of a user or system.
- [ ] Ensuring that a system is available when needed.

**Rationale:** The text states: "First is confidentiality. So only authorized people can read or access data."

### What is "Integrity" in the context of security goals?

- [ ] Ensuring that only authorized people can read or access data.
- [x] Ensuring that data is accurate and complete, and has not been tampered with.
- [ ] Verifying the identity of a user or system.
- [ ] Ensuring that a system is available when needed.

**Rationale:** The text states: "Second is integrity. So the data is accurate and complete. No one has tampered with it."

### What is "Authenticity" in the context of security goals?

- [ ] Ensuring that data is accurate and complete.
- [ ] Ensuring that only authorized people can read or access data.
- [x] Verifying the identity of a user or system, ensuring they are who they claim to be.
- [ ] Ensuring that a system is available when needed.

**Rationale:** The text states: "Third is authenticity. So you are who you claim to be."

### What is "Authorization" in the context of security goals?

- [ ] Verifying the identity of a user or system.
- [x] Determining what an authenticated user or system is allowed to do.
- [ ] Ensuring that data is accurate and complete.
- [ ] Ensuring that a system is available when needed.

**Rationale:** The text states: "Fourth is authorization. So what are you allowed to do?"

### What is "Availability" in the context of security goals?

- [ ] Ensuring that data is accurate and complete.
- [ ] Verifying the identity of a user or system.
- [x] Ensuring that a system is available when needed, even under attack.
- [ ] Determining what an authenticated user or system is allowed to do.

**Rationale:** The text states: "Fifth is availability. So the system is available when you need it, even if there's an attack going on."

### What is the primary challenge related to "invasive logging" that the text addresses?

- [ ] It makes log files too large.
- [ ] It prevents the use of logging frameworks.
- [x] It involves interweaving logging statements directly into the core application code, making it less flexible and harder to maintain.
- [ ] It makes it difficult to choose the output channel for logs.

**Rationale:** The text states, "The first challenge is, I don't want invasive logging. So on the Oak days or your first progress that you wrote, maybe you really had a statement like system error, print line, so on so, source directly in the code, interwoven with it, and then in some cases, of course, that was in the old days, but now you would send message or an email or you write it to a socket or whatever, and all this was mixed with your real code, so to speak, and you don't want this kind of invasive logging."

### What is the recommended solution for achieving high flexibility and non-invasive logging?

- [ ] Writing all log messages directly to the console.
- [ ] Manually managing log file rotation.
- [x] Using a logging framework and a logging facade to abstract away the details of logging implementation and output.
- [ ] Sending all log messages via email.

**Rationale:** The text suggests, "The major solution is to use a logging framework and a logging facade, so the facade just allows you to have these methods like, what did I say, logger, debug, logger1, logger7, and then it's just sent off to the logging software behind the facade, but you are on this side of the facade, and you don't know about these things..."

### What is the minimum level of logging that should be implemented, according to the text?

- [ ] Only fatal errors should be logged.
- [ ] Every method entry and exit should be logged.
- [x] Every time system boundaries are crossed (e.g., user input, data persistence, external system calls).
- [ ] Only debug messages during development.

**Rationale:** The text advises, "the least you should do is every time the system boundaries crossed, you should log that, so it gets into the system by the user pressing some keys, that should be logged, or it's shown to the user, maybe that's logged, it's persisted, or we put it out of the database, that should be logged, or it leaves the system, either to an external system or the subsystem, so all these system boundaries, those should be logged..."

### What is a "ring buffer" or "rolling file appender" used for in logging?

- [ ] To store all log messages in memory indefinitely.
- [ ] To send log messages to multiple destinations simultaneously.
- [x] To manage log file size by overwriting older logs when space runs out, keeping a recent history.
- [ ] To encrypt log messages for security.

**Rationale:** The text explains, "If you run it with space issues, you can use a ring buffer, and many people, what's a ring buffer, that's an ancient term, basically that's a rolling file appender, so you start logging, and you have a suffix dot one dot two, and then it goes up to ten, and when you reach ten, then it starts at one again, so you always have this kind of zone of most recent things that you log that you can look up, and they're only overwritten when you're running out of space."

### What is a challenge when merging log files from different systems?

- [ ] Log files are always in the same format, making merging trivial.
- [x] System clocks might not be synchronized, character encodings might differ, and log levels might vary, making merging complex.
- [ ] Log files are too small to provide useful information.
- [ ] It is impossible to merge log files from different operating systems.

**Rationale:** The text mentions, "if you do this across systems, then it's getting more challenging because system clocks might not be on sync, character encoding might be different in many, many other things you will find out at some point, unless you have already, and that can be complex to merge these things together, and the other thing is, if you have them in different files, sometimes it's not just the logging and the encoding, but sometimes it's different levels, and then you have to somehow weave them together, and that can be a challenge."

### What is the primary purpose of a "logging facade"?

- [ ] To directly implement logging logic.
- [x] To abstract away the details of logging implementation and output, allowing the application code to interact with a simple logging interface.
- [ ] To store log messages in a database.
- [ ] To analyze log data for security breaches.

**Rationale:** The text states: "The major solution is to use a logging framework and a logging facade, so the facade just allows you to have these methods like, what did I say, logger, debug, logger1, logger7, and then it's just sent off to the logging software behind the facade, but you are on this side of the facade, and you don't know about these things..."

### What is the benefit of using a logging framework over manual logging?

- [ ] Logging frameworks are always faster.
- [x] Logging frameworks provide flexibility in choosing output channels, log levels, and formatting without changing application code.
- [ ] Logging frameworks eliminate the need for any configuration.
- [ ] Logging frameworks automatically fix errors in the application.

**Rationale:** The text implies this by discussing the flexibility offered by logging frameworks and facades, contrasting it with invasive logging.

### What is the advice regarding logging sensitive data?

- [ ] All data should be logged, regardless of sensitivity.
- [x] Sensitive data should be handled with extreme care and potentially not logged, or logged only after encryption or anonymization.
- [ ] Sensitive data should only be logged at the highest debug level.
- [ ] Sensitive data can be logged as long as the log files are stored locally.

**Rationale:** The text implicitly warns about this by using the example of unencrypted sensitive data in log files in the previous section (050_Technical_Architecture.txt) and emphasizing security. While not explicitly stated in this text, it's a direct implication of the security concerns.

### What is the distinction between an "error" and an "exception" as defined in the text?

- [ ] An error is a programming mistake, while an exception is a runtime issue.
- [x] An error is a difference between what is expected and what is received, while an exception is when the system cannot deal with that unexpected result.
- [ ] An error is always recoverable, while an exception is not.
- [ ] There is no practical difference; the terms are interchangeable.

**Rationale:** The text clarifies: "Error means there's a difference between what you expect and what you get... The exception is when you cannot deal with that three. So that's a different level. First thing is the error itself, and then how you deal with that. And the one is the error, and the other thing is the exception."

### What is a major challenge of error handling in distributed systems?

- [ ] Errors never occur in distributed systems.
- [ ] Errors are always easy to diagnose and fix remotely.
- [x] Errors occurring on remote machines need to be signaled back, and they can be transformed or wrapped, making diagnosis complicated.
- [ ] Distributed systems automatically correct all errors without human intervention.

**Rationale:** The text states, "So in distributed systems, it's a major challenge to deal with errors that occur on machines that are far away from yours. And it's important that you tell the difference between what's the real error and what's the consequential error."

### What is the importance of distinguishing between an "original error" and a "consequential error"?

- [ ] All errors are equally important and should be treated the same.
- [x] It helps in identifying the root cause of a problem and avoids being overwhelmed by a cascade of secondary errors.
- [ ] Consequential errors are always more critical than original errors.
- [ ] This distinction is only relevant for very small systems.

**Rationale:** The text illustrates this with an anecdote: "Only one was the original error, and the rest were consequential errors... So if that distinction had been in place, he just would have gotten one message, and that would have been it, and he would have known what's important, what's not important, so that distinction is important."

### What does the text advise regarding preemptive error handling, using the example of disk space?

- [ ] Continue operations as normal, even if resources are running out.
- [ ] Only react to errors after they have fully manifested and caused a system crash.
- [x] React preemptively to potential problems (e.g., low disk space) to prevent critical failures and ensure error logging is possible.
- [ ] Rely on the operating system to handle all resource management automatically.

**Rationale:** The text states, "If you're driving, and you see there's an obstacle in the road, then don't hit it, but somehow steer around it... if you see that disk space is running out or memory is running out, don't continue as if nothing is wrong... So if you see these things happening, react preemptively, so it doesn't happen in the first place."

### What is the recommended approach for displaying technical errors to end-users?

- [ ] Always show the full stack trace for complete transparency.
- [ ] Hide all errors from the user to avoid confusion.
- [x] Hide technical details, quietly log the error, and show a user-friendly, understandable message.
- [ ] Send an automatic message to the user's phone with all technical error codes.

**Rationale:** The text advises, "If there's a technical error, try to hide it from the user. If you just show a stack trace, what are they supposed to do with that?... Instead, quietly log it, show them a user-friendly, understandable message, sorry, something went wrong, please try again."

### What is the primary goal of error handling in software?

- [ ] To prevent all errors from ever occurring.
- [x] To deal with unexpected results or situations in a controlled manner.
- [ ] To always crash the system when an error occurs.
- [ ] To ignore all errors that do not lead to immediate system failure.

**Rationale:** The text defines error as "a difference between what you expect and what you get" and exception as "when you cannot deal with that." The overall discussion is about how to handle these unexpected results.

### What is the "fail-fast" principle in error handling?

- [ ] To continue processing as long as possible, even with errors.
- [x] To detect errors as early as possible and stop processing immediately to prevent further damage or propagation of incorrect state.
- [ ] To log errors only after the system has crashed.
- [ ] To ignore errors that do not affect the user interface.

**Rationale:** The text states: "So if you see these things happening, react preemptively, so it doesn't happen in the first place. So fail fast. If you see something is going wrong, then stop it right there."

### What is the advice regarding error messages for developers?

- [ ] Error messages should be as short as possible.
- [x] Error messages for developers should be as verbose and detailed as possible, including all relevant technical information.
- [ ] Error messages should only contain user-friendly text.
- [ ] Error messages should be sent directly to the user's email.

**Rationale:** The text states: "For developers, it's the other way around. You want to have as much information as possible. So you want to have the stack trace, you want to have the parameters, you want to have the context, you want to have everything that you can get your hands on."

### What is the fundamental problem that the cross-cutting concern of "sustainability" boils down to?

- [ ] Reducing the number of developers needed for a project.
- [x] Energy efficiency, specifically not using more energy than necessary.
- [ ] Minimizing the amount of code written.
- [ ] Maximizing the number of features in an application.

**Rationale:** The text states, "So it all boils down to energy efficiency. And the thing is, basically, don't use more energy than necessary."

### Which of the following are recommended approaches for improving sustainability at the architectural level?

- [ ] Always choosing a monolithic architecture for simplicity.
- [x] Fixing the scope of the application to avoid unnecessary features.
- [ ] Using the most complex algorithms available.
- [x] Picking an appropriate architecture (e.g., microservices for fluctuating usage, but being aware of communication overhead).

**Rationale:** The text advises: "Fix the scope of your application. If you're implementing things that you don't need right now, those are just wasting energy... then pick an appropriate architecture... If you have a monolith, then it's very hard for you to scale two fluctuations in usage patterns... On the other hand, if you have a huge number of microservices, then of course, communications overhead will kill you. And that will use up lots of energy."

### What is a key recommendation for sustainable coding practices?

- [ ] Always write custom algorithms to ensure maximum control.
- [x] Use efficient algorithms and standard libraries instead of reinventing the wheel.
- [ ] Poll frequently for changes to ensure data freshness.
- [ ] Avoid caching data to reduce memory usage.

**Rationale:** The text suggests: "First thing, use an efficient algorithm... So pick an efficient algorithm, don't waste time. And don't. Think about these things yourself. There are standard libraries in most cases."

### When dealing with network resources for sustainability, what is advised?

- [ ] Transferring all data, regardless of size, over the main network.
- [ ] Locating resources as far as possible from where they are displayed.
- [x] Having resources (like large files or videos) as close as possible to where they need to be displayed, using Content Delivery Networks (CDNs).
- [ ] Ignoring the trade-offs between memory, drive space, and network volume.

**Rationale:** The text states: "If you're using a network, and chances are you are, have the resources as close to where they need to be displayed... And if you have internet and services, co-locate them so there's less data tracing."

### Which of the following are strategies for improving sustainability in operations and deployment?

- [ ] Always running servers at maximum capacity.
- [x] Using burstable instances that can scale up and down based on load.
- [ ] Avoiding cloud deployment in favor of on-premise solutions.
- [x] Employing adaptive load distribution to shut down unused servers.
- [x] Right-sizing instances to match actual needs.
- [ ] Ignoring load monitoring once the system is deployed.

**Rationale:** The text suggests: "Those burstable instances... Use adaptive load distribution. So if we don't need the server, shut it down... Right size, the instances, so if it's too big, make it smaller... Use load monitoring because if you don't see what's going on, then you cannot make adjustments based on what's going on."

### What is the primary goal of "sustainability" in software architecture?

- [ ] To make software last forever.
- [x] To ensure energy efficiency by not using more energy than necessary.
- [ ] To reduce the number of features in an application.
- [ ] To increase the speed of software development.

**Rationale:** The text states: "So it all boils down to energy efficiency. And the thing is, basically, don't use more energy than necessary."

### How can "fixing the scope" of an application contribute to sustainability?

- [ ] By allowing for more features to be added later.
- [x] By avoiding the implementation of unnecessary features that would waste energy.
- [ ] By making the application more complex.
- [ ] By increasing the development time.

**Rationale:** The text states: "Fix the scope of your application. If you're implementing things that you don't need right now, those are just wasting energy."

### What is the trade-off between monolithic and microservices architectures in terms of sustainability?

- [ ] Monoliths are always more sustainable than microservices.
- [x] Monoliths are hard to scale for fluctuating usage, while microservices have communication overhead that can use lots of energy.
- [ ] Microservices are always more sustainable than monoliths.
- [ ] There is no trade-off; both are equally sustainable.

**Rationale:** The text states: "If you have a monolith, then it's very hard for you to scale two fluctuations in usage patterns... On the other hand, if you have a huge number of microservices, then of course, communications overhead will kill you. And that will use up lots of energy."

### What is the advice regarding "polling" for changes in a sustainable system?

- [ ] Always poll as frequently as possible to ensure data freshness.
- [x] Avoid polling and use push mechanisms instead, as polling wastes energy.
- [ ] Polling is only acceptable for real-time applications.
- [ ] Polling has no impact on energy consumption.

**Rationale:** The text states: "Don't poll. If you're polling, you're wasting energy. Use push mechanisms instead."

### What is the importance of "load monitoring" for sustainability in operations?

- [ ] It is only necessary during the initial deployment phase.
- [x] It is crucial for making adjustments and optimizing resource usage based on actual load.
- [ ] It has no impact on energy consumption.
- [ ] It is only relevant for very small systems.

**Rationale:** The text states: "Use load monitoring because if you don't see what's going on, then you cannot make adjustments based on what's going on."

### What is a common challenge faced by a new developer joining a company, as described in the text?

- [ ] They immediately understand all aspects of the codebase.
- [x] They have many questions about the system's structure, interactions, and purpose that are not easily answered.
- [ ] Their test cases always pass on the first try.
- [ ] They are discouraged from asking questions to team members.

**Rationale:** The text describes the new developer's experience: "And as soon as you're ready to start coding, you will probably find that your test cases fail and you have a lot of questions and you will have a closer look at the code. Okay, how do these parts interact? Why is this protocol used here? Should this component be reused? What is the whole point of this anyway? Public attributes, seriously?"

### Which of the following are common, unhelpful responses a new developer might receive when asking questions about the codebase?

- [x] "It has always been like that" or "This has evolved over time."
- [ ] "Here is the comprehensive and up-to-date architecture documentation."
- [x] "A former team member did that."
- [x] "It's all in the wiki" (implying it's hard to find or outdated).
- [x] "Oh, but that, that's just a quick fix."
- [x] "Anyway, no docs in Agile."

**Rationale:** The text lists these common responses: "And they say, it has always been like that. This has evolved over time. A former team member did that. It's all in the wiki. Oh, but that, that's just a quick fix. And anyway, no docs in Agile."

### What is the primary benefit of documenting the architecture, as stated in the text?

- [ ] It eliminates the need for any team communication.
- [ ] It makes the system completely bug-free.
- [x] It helps to understand the system at a higher level of abstraction than just the source code and maintain an overview throughout its lifespan.
- [ ] It guarantees that no quick fixes will ever be introduced.

**Rationale:** The text explains, "Documenting the architecture helps. It helps you to understand the system at a higher level of abstraction than just the source code. And it helps you to maintain an overview of the system throughout its entire lifespan."

### How does architecture documentation contribute to the sustainable development of a system?

- [ ] By forcing developers to write more code.
- [ ] By making the system rigid and resistant to change.
- [x] It provides direction for the sustainable development of the system for the team.
- [ ] It automates the entire development process.

**Rationale:** The text states, "It provides direction for the sustainable development of the system for you and the whole team."

### What is one of the key functions of architecture documentation related to communication?

- [ ] To replace all verbal communication within the team.
- [x] To communicate, describe, and assess the actual architecture.
- [ ] To hide complex details from stakeholders.
- [ ] To serve as a legal contract for the software.

**Rationale:** The text mentions, "And it helps to communicate, describe, and assess the actual architecture."

### What is the primary challenge for a new developer when trying to understand an undocumented codebase?

- [ ] The code is too simple.
- [x] They have to figure out the system's structure, interactions, and purpose by themselves, which is time-consuming and inefficient.
- [ ] The existing documentation is too detailed.
- [ ] They are immediately productive without any guidance.

**Rationale:** The text describes the new developer's experience: "And as soon as you're ready to start coding, you will probably find that your test cases fail and you have a lot of questions and you will have a closer look at the code. Okay, how do these parts interact? Why is this protocol used here? Should this component be reused? What is the whole point of this anyway? Public attributes, seriously?" This implies the challenge of figuring things out without documentation.

### What is the role of architecture documentation in maintaining an overview of the system?

- [ ] It is only useful for the initial design phase.
- [x] It helps to maintain an overview of the system throughout its entire lifespan.
- [ ] It makes the system more complex.
- [ ] It is only for external auditors.

**Rationale:** The text states: "And it helps you to maintain an overview of the system throughout its entire lifespan."

### How does architecture documentation help in assessing the actual architecture?

- [ ] It automatically fixes all architectural flaws.
- [x] It provides a baseline against which the implemented system can be compared and evaluated.
- [ ] It eliminates the need for any architectural reviews.
- [ ] It is only used for historical purposes.

**Rationale:** The text states: "And it helps to communicate, describe, and assess the actual architecture."

### What is the primary purpose of using "views" when documenting software architecture?

- [ ] To make the documentation longer and more detailed.
- [ ] To hide information from certain stakeholders.
- [x] To provide stakeholder-specific abstractions of the system, focusing only on relevant aspects for each stakeholder.
- [ ] To create a single, monolithic document that covers everything.

**Rationale:** The text states, "Each view is a stakeholder-specific abstraction of the house, focusing only on those aspects that are relevant from the stakeholder's perspective."

### Using the analogy of building a house, what would be the focus of the property owner's view?

- [ ] The strength of the bearing walls.
- [x] The functional aspects, such as room layout and ensuring spaces are suitable for their purpose (e.g., living room size for a sofa).
- [ ] The type of electrical wiring used.
- [ ] The material used for the roof.

**Rationale:** The text explains, "If you are the property owner, you want to define where each room is located, the kitchen, the living room and so on. So, your view covers the functional aspects of the house, ensuring that the living room is large enough for a sofa and a TV and that the fridge and the kitchen is not too far away."

### What is the main concern of a structural engineer's view of a house?

- [ ] The color of the paint on the walls.
- [x] The stability of the house, specifically the bearing walls.
- [ ] The placement of electrical outlets.
- [ ] The type of flooring in each room.

**Rationale:** The text states, "When you are a structural engineer, it's all about the stability of the house. You need a view that shows the bearing walls of the house so you can check if they are strong enough."

### Why are interdisciplinary overlaps and references between different views essential?

- [ ] To make the documentation more complex and difficult to understand.
- [ ] To ensure that each stakeholder works in complete isolation.
- [x] To enable effective collaboration and avoid issues like thermal bridges (in the house analogy) or other inconsistencies.
- [ ] To reduce the total number of views required.

**Rationale:** The text emphasizes, "Interdisciplinary overlaps and references between the views are essential, for example, to enable the facade contractors to work effectively hand-in-hand to avoid thermal bridges."

### What is a fundamental requirement for all views of an architecture?

- [ ] They must all be identical in content.
- [ ] They must contradict each other to show different perspectives.
- [x] They must be overall consistent and not contradict each other, as they represent different aspects of the same reality.
- [ ] They must be generated automatically from the source code.

**Rationale:** The text concludes, "All those views need to have in common that they are overall consistent and do not contradict each other. In the end, all these views show different aspects of just the same reality."

### What is the primary purpose of architecture documentation, as illustrated by the house analogy?

- [ ] To provide a single, all-encompassing blueprint for construction.
- [x] To provide different, stakeholder-specific abstractions of the system, each focusing on relevant aspects.
- [ ] To replace the need for communication between different trades.
- [ ] To ensure that only one person understands the entire project.

**Rationale:** The text states: "Each view is a stakeholder-specific abstraction of the house, focusing only on those aspects that are relevant from the stakeholder's perspective."

### What is the primary focus of the "Context View" in software architecture documentation?

- [ ] The internal static structure of the system.
- [x] The system as a black box and its relationships with its external context via interfaces.
- [ ] How building blocks interact at runtime.
- [ ] On which computers building blocks are deployed.

**Rationale:** The text states, "The context view is the bird's eye view of our system as a black box and how it relates to its context via interfaces."

### Which view typically shows the static structure of the architecture, including components, interfaces, layers, and their relationships?

- [ ] The Context View
- [x] The Building Block View
- [ ] The Runtime View
- [ ] The Deployment View

**Rationale:** The text explains, "The building block view shows the static structure of our architecture. This is usually what we think of when talking about software architecture documentation. The building block view consists of components such as interfaces, layers and their relationships and responsibilities."

### What does the "Runtime View" describe?

- [ ] The physical location of servers.
- [ ] The historical evolution of the system.
- [x] A live view of building blocks, detailing how they interact at runtime, including synchronization and performance.
- [ ] The security vulnerabilities of the system.

**Rationale:** The text states, "The runtime view is a live view of our building blocks, describing how they interact at runtime, whether they are synchronized, how they perform and so on."

### What information is conveyed by the "Deployment View"?

- [ ] The logical dependencies between software modules.
- [ ] The business processes supported by the system.
- [x] On which computers building blocks are deployed and executed, and via which networks they interact.
- [ ] The user interface design and interaction flows.

**Rationale:** The text defines it: "The deployment view describes on which computers our building blocks are deployed and executed and via which networks they interact."

### Besides the four specific views mentioned, what other aspects can established views highlight?

- [ ] Only functional requirements.
- [x] Data flow, data structures, security, or user interaction with the system.
- [ ] Project management timelines.
- [ ] Team communication strategies.

**Rationale:** The text notes, "There are many other established views that highlight different aspects, such as data flow, data structures, security or user interaction with the system."

### What is the primary purpose of the "Building Block View"?

- [ ] To show the system's external dependencies.
- [x] To illustrate the static structure of the architecture, including components, interfaces, layers, and their relationships.
- [ ] To describe how building blocks interact at runtime.
- [ ] To show the physical deployment of building blocks.

**Rationale:** The text states: "The building block view shows the static structure of our architecture. This is usually what we think of when talking about software architecture documentation. The building block view consists of components such as interfaces, layers and their relationships and responsibilities."

### What kind of information is typically included in the "Runtime View"?

- [ ] The source code of the building blocks.
- [x] Details on how building blocks interact at runtime, including synchronization and performance.
- [ ] The deployment environment and network topology.
- [ ] The business processes supported by the system.

**Rationale:** The text states: "The runtime view is a live view of our building blocks, describing how they interact at runtime, whether they are synchronized, how they perform and so on."

### What is the primary purpose of the "Deployment View"?

- [ ] To show the logical structure of the system.
- [x] To describe on which computers building blocks are deployed and executed, and via which networks they interact.
- [ ] To illustrate the internal design of individual components.
- [ ] To document the business requirements.

**Rationale:** The text states: "The deployment view describes on which computers our building blocks are deployed and executed and via which networks they interact."

### What is the primary focus of the "Context View" in architecture documentation?

- [ ] The internal implementation details of the system.
- [x] How the system is embedded in its context, appearing as a black box, and highlighting external interactions.
- [ ] The detailed design of individual components within the system.
- [ ] The performance metrics of the system's internal processes.

**Rationale:** The text states, "Here the focus is not on the internals of our system, but rather on how our system is embedded in its context. The system itself appears as a black box, highlighting the external actors interacting with it."

### Which types of interfaces are typically considered in the Context View?

- [ ] Only programmatic APIs.
- [x] Web UI, technical API, batch process, and exchange file.
- [ ] Only user interfaces.
- [ ] Only database connections.

**Rationale:** The text specifies, "What type of interface is it? For example, is it a web UI, a technical API, a batch process or an exchange file?"

### a What communication protocols are commonly examined when documenting interfaces in the Context View?

- [ ] Only HTTP protocols.
- [x] REST and messaging protocols.
- [ ] Only database protocols.
- [ ] Only file transfer protocols.

**Rationale:** The text asks, "What protocol is used to communicate with the interface? For instance, rest or messaging?"

### b Which communication patterns are important to identify when analyzing interfaces in the Context View?

- [ ] Only real-time patterns.
- [ ] Only batch processing patterns.
- [x] Synchronous and asynchronous patterns.
- [ ] Only event-driven patterns.

**Rationale:** The text asks, "And what communication pattern, synchronous or asynchronous is underlying it?"

### Why are key use cases often included as part of the Context View?

- [ ] To provide a detailed step-by-step guide for users.
- [ ] To replace the need for any other documentation.
- [x] To help understand how the system fits into its context.
- [ ] To define the internal algorithms of the system.

**Rationale:** The text mentions, "To understand how our system fits into its context, it can be very helpful to know the key use cases. Therefore, these are often part of the context view as well."

### What is the typical role of the Context View in architecture documentation?

- [ ] It provides a highly detailed technical specification.
- [ ] It is only used by developers for implementation.
- [x] It serves as an entry point, providing a rough overview of the architecture.
- [ ] It is the final and most comprehensive document.

**Rationale:** The text states, "The context view usually serves as our entry point into the architecture documentation and provides only a very rough overview."

### What is the primary characteristic of the system in the Context View?

- [ ] It is shown with all its internal components.
- [x] It appears as a black box, highlighting its external interactions.
- [ ] It is depicted as a white box, showing all its internal logic.
- [ ] It is represented as a single, isolated entity.

**Rationale:** The text states: "The system itself appears as a black box, highlighting the external actors interacting with it."

### Which type of external actors represent people who interact with the system in the Context View?

- [ ] System administrators only.
- [x] Human users.
- [ ] External developers.
- [ ] Database administrators only.

**Rationale:** The text states: "These can be human users, external systems, or external hardware."

### a What category of external actors consists of other software applications or services in the Context View?

- [ ] Internal modules.
- [x] External systems.
- [ ] Human users.
- [ ] Development tools.

**Rationale:** The text states: "These can be human users, external systems, or external hardware."

### b Which type of external actors represent physical devices or equipment that interact with the system in the Context View?

- [ ] Virtual machines.
- [ ] Software containers.
- [x] External hardware.
- [ ] Cloud services.

**Rationale:** The text states: "These can be human users, external systems, or external hardware."

### What is the purpose of including external actors in the Context View?

- [ ] To detail their internal implementation.
- [x] To show how they interact with the system and influence its behavior.
- [ ] To define their programming languages.
- [ ] To specify their deployment environment.

**Rationale:** The text states: "The system itself appears as a black box, highlighting the external actors interacting with it." The purpose is to show the system's interaction with its environment.

### What is the primary purpose of the "Building Block View" in software architecture documentation?

- [ ] To show how the system interacts with external actors.
- [x] To detail the static inner structure of the system, including components, subsystems, and their relationships.
- [ ] To describe the runtime behavior and interactions of the system.
- [ ] To illustrate the deployment of building blocks on physical hardware.

**Rationale:** The text states, "The building block view. This view shows us the static inner structure of our system. It details the building blocks of the system, which components, subsystems, packages, classes, operations and so on exist and how these elements are related."

### Which of the following elements are typically detailed in a Building Block View?

- [ ] External users and their roles.
- [x] Components, subsystems, packages, and classes.
- [ ] Network protocols and communication patterns.
- [ ] Physical servers and virtual machines.

**Rationale:** The text specifies, "It details the building blocks of the system, which components, subsystems, packages, classes, operations and so on exist and how these elements are related."

### a Which architectural abstraction level represents modular units of functionality that can be independently developed and deployed?

- [x] Components
- [ ] External users
- [ ] Network protocols
- [ ] Physical servers

**Rationale:** The text specifies that Building Block Views detail "components" as one of the key building blocks of the system that are documented to show the static inner structure.

### b Which architectural abstraction level represents larger organizational units that group related components together?

- [ ] Classes
- [x] Subsystems
- [ ] Network protocols
- [ ] Virtual machines

**Rationale:** The text specifies that Building Block Views detail "subsystems" as one of the key building blocks that help organize the static inner structure of the system.

### c Which architectural abstraction level represents logical groupings of related classes and interfaces in object-oriented systems?

- [ ] Components
- [ ] External users
- [x] Packages
- [ ] Physical servers

**Rationale:** The text specifies that Building Block Views detail "packages" as one of the building blocks that are documented to show how elements are related in the system structure.

### d Which architectural abstraction level represents the most granular units of object-oriented design with attributes and methods?

- [ ] Subsystems
- [x] Classes
- [ ] Network protocols
- [ ] Virtual machines

**Rationale:** The text specifies that Building Block Views detail "classes" as one of the building blocks of the system, representing the fine-grained elements that exist within the static structure.

### How does the Building Block View help in understanding the source code?

- [ ] By providing a line-by-line explanation of every code file.
- [ ] By automatically generating executable code from the diagrams.
- [x] By allowing understanding at a higher level of abstraction, providing a better overview.
- [ ] By identifying all runtime errors in the code.

**Rationale:** The text states, "The building block view allows us to understand the source code at a higher level of abstraction, providing a better overview."

### What is the relevance of the Building Block View for developers?

- [ ] It helps them to avoid writing any code.
- [x] It helps them to get familiar with the source code, find areas needing attention, and identify areas for programming tasks.
- [ ] It is primarily for project managers to track progress.
- [ ] It defines the non-functional requirements of the system.

**Rationale:** The text explains, "Relevance. The building block view helps us to get our heads around the source code, find the spots that need our attention and identify the areas that we want to work on to fulfill our programming tests."

### What is the primary focus of the Building Block View?

- [ ] Dynamic interactions between components.
- [x] The static inner structure of the system.
- [ ] External system dependencies.
- [ ] Deployment configurations.

**Rationale:** The text states: "The building block view. This view shows us the static inner structure of our system."

### What kind of relationships between elements are shown in the Building Block View?

- [ ] Only runtime dependencies.
- [x] How the elements are related to each other.
- [ ] Only data flow relationships.
- [ ] Only physical connections.

**Rationale:** The text states: "It details the building blocks of the system, which components, subsystems, packages, classes, operations and so on exist and how these elements are related."

### What is the benefit of the Building Block View for understanding the system's source code?

- [ ] It replaces the need to read the source code.
- [x] It allows understanding at a higher level of abstraction, providing a better overview.
- [ ] It automatically generates the source code.
- [ ] It only shows the most complex parts of the code.

**Rationale:** The text states: "The building block view allows us to understand the source code at a higher level of abstraction, providing a better overview."

### What is the primary focus of the "Runtime View" in software architecture documentation?

- [ ] The static structure of the system's components.
- [x] The dynamic aspects of building blocks and system context, examining sample use cases and observing processes and threads at runtime.
- [ ] The physical deployment of the system on hardware.
- [ ] The external interfaces and dependencies of the system.

**Rationale:** The text states, "Here we look at the live system and consider the dynamic aspects of our building blocks and the context of our system. We examine sample use cases where actors interact with our system and observe which processes and threads our system executes at runtime."

### Which of the following aspects are examined within the Runtime View?

- [ ] The source code of individual functions.
- [x] How the system starts up or shuts down.
- [ ] The database schema design.
- [x] What happens during the lifecycle of the system or individual building blocks.

**Rationale:** The text mentions, "This includes how our system starts up or shuts down and what happens during the lifecycle of our system or individual building blocks."

### What is the relevance or utility of the Runtime View?

- [ ] It helps in defining the initial business requirements.
- [ ] It is primarily used for marketing purposes.
- [x] It helps understand how the system actually operates, which is useful for communication between developers and operators.
- [ ] It provides a detailed financial overview of the project.

**Rationale:** The text states, "Relevance? The runtime view helps us understand how our system actually operates. This is useful for example in the communication between developers and operators."

### What kind of interactions are observed in the Runtime View?

- [ ] Only interactions between external systems.
- [x] Interactions between actors and the system, and processes/threads executed by the system.
- [ ] Only static dependencies between components.
- [ ] Only database queries.

**Rationale:** The text states: "We examine sample use cases where actors interact with our system and observe which processes and threads our system executes at runtime."

### What is the primary benefit of the Runtime View for communication between developers and operators?

- [ ] It provides a detailed code-level view for both.
- [x] It helps both parties understand how the system actually operates in a live environment.
- [ ] It automates the deployment process.
- [ ] It eliminates the need for any verbal communication.

**Rationale:** The text states: "The runtime view helps us understand how our system actually operates. This is useful for example in the communication between developers and operators."

### a (Improved) Which of the following is a primary aspect of the Runtime View's focus on dynamic behavior?

- [ ] The static structure of system components
- [x] The dynamic aspects of building blocks and system context
- [ ] The physical deployment architecture
- [ ] The database schema relationships

**Rationale:** The text states, "Here we look at the live system and consider the dynamic aspects of our building blocks and the context of our system."

### b (Improved) What type of analysis does the Runtime View perform regarding system interactions?

- [ ] Analysis of static code dependencies
- [x] Examination of sample use cases where actors interact with the system
- [ ] Review of hardware specifications
- [ ] Evaluation of security vulnerabilities

**Rationale:** The text states, "We examine sample use cases where actors interact with our system."

### c (Improved) What does the Runtime View observe regarding system execution?

- [ ] Source code compilation processes
- [x] Which processes and threads the system executes at runtime
- [ ] Memory allocation patterns only
- [ ] Network bandwidth utilization

**Rationale:** The text states, "observe which processes and threads our system executes at runtime."

### a (Improved) Which system lifecycle phase is examined within the Runtime View?

- [ ] The initial system design phase
- [x] How the system starts up
- [ ] The requirements gathering phase
- [ ] The testing phase planning

**Rationale:** The text mentions, "This includes how our system starts up."

### b (Improved) Which system termination aspect is covered in the Runtime View?

- [ ] Project closure procedures
- [x] How the system shuts down
- [ ] Code repository archiving
- [ ] Documentation finalization

**Rationale:** The text mentions, "This includes how our system... shuts down."

### c (Improved) What lifecycle aspects does the Runtime View examine beyond startup and shutdown?

- [ ] Development team lifecycle management
- [x] What happens during the lifecycle of the system or individual building blocks
- [ ] Hardware replacement cycles
- [ ] Software licensing renewals

**Rationale:** The text mentions, "what happens during the lifecycle of our system or individual building blocks."

### What is the primary focus of the "Deployment View" in software architecture documentation?

- [ ] The internal logic and relationships of software components.
- [x] Which building blocks are deployed and executed on which hardware components, and how they interact via logical and physical channels.
- [ ] The dynamic behavior of the system during runtime.
- [ ] The external context and interfaces of the system.

**Rationale:** The text states, "In this view we see which building blocks are deployed and executed on which hardware components. This involves specific computers, processors, memory and also logical channels such as web services, remote procedure calls, message-oriented middleware and so on, as well as the physical channels on which these are based."

### Which of the following aspects are considered relevant within the Deployment View?

- [ ] The specific programming languages used for development.
- [x] Availability, including documenting downtimes due to errors or maintenance windows.
- [ ] The business processes supported by the application.
- [x] Capacities of networks and storage media, including expected data volumes.

**Rationale:** The text mentions, "Availability is also part of the deployment view, documenting down times due to errors or maintenance windows. Additionally, the capacities of networks and storage media are relevant, including the specific data volumes we expect during the execution of our system."

### What is the relevance or utility of the Deployment View?

- [ ] It helps in designing the user interface.
- [ ] It is primarily for defining functional requirements.
- [x] It assists developers and operators in communication and practical aspects of operation, such as identifying bottlenecks and estimating costs.
- [ ] It provides a detailed financial overview of the project.

**Rationale:** The text states, "Relevance. The deployment view assists developers and operators in communication and, of course, in practical aspects of operation. This includes identifying bottlenecks, estimating costs, assessing risks and more."

### What kind of channels are described as being part of the Deployment View?

- [ ] Only physical network cables.
- [x] Logical channels (e.g., web services, RPI, message-oriented middleware) and physical channels (e.g., network connections).
- [ ] Only wireless connections.
- [ ] Only in-memory data transfers.

**Rationale:** The text states: "This involves specific computers, processors, memory and also logical channels such as web services, remote procedure calls, message-oriented middleware and so on, as well as the physical channels on which these are based."

### What is the importance of documenting "availability" in the Deployment View?

- [ ] It is only for legal compliance.
- [x] It includes documenting downtimes due to errors or maintenance windows, which is crucial for operational planning.
- [ ] It guarantees 100% uptime for the system.
- [ ] It is irrelevant for the technical architecture.

**Rationale:** The text states: "Availability is also part of the deployment view, documenting down times due to errors or maintenance windows."

### What kind of costs can be estimated using the Deployment View?

- [ ] Only development costs.
- [x] Costs related to hardware, network infrastructure, and operational expenses.
- [ ] Only software license costs.
- [ ] Only personnel costs.

**Rationale:** The text states: "This includes identifying bottlenecks, estimating costs, assessing risks and more." The costs are implied to be related to the deployment and operational aspects.

### (Improved - Building Block Mapping) Which aspect of the Deployment View focuses on the relationship between software components and hardware?

- [x] Which building blocks are deployed and executed on which hardware components.
- [ ] The internal logic and relationships of software components.
- [ ] The dynamic behavior of the system during runtime.
- [ ] The external context and interfaces of the system.

**Rationale:** The text states, "In this view we see which building blocks are deployed and executed on which hardware components." This specifically addresses the mapping aspect of deployment.

### (Improved - Execution Environment) What does the Deployment View describe regarding the hardware execution environment?

- [x] Specific computers, processors, and memory components where software is executed.
- [ ] The programming languages used for development.
- [ ] The user interface design patterns.
- [ ] The business logic implementation details.

**Rationale:** The text mentions "This involves specific computers, processors, memory" as part of what the deployment view covers regarding the execution environment.

### (Improved - Communication Channels) What types of communication mechanisms are documented in the Deployment View?

- [x] Both logical channels (web services, RPC, middleware) and their underlying physical channels.
- [ ] Only internal method calls within components.
- [ ] Only user interface interactions.
- [ ] Only database queries and responses.

**Rationale:** The text describes "logical channels such as web services, remote procedure calls, message-oriented middleware and so on, as well as the physical channels on which these are based."

### (Improved - Logical Channels) Which of the following are examples of logical channels described in the Deployment View?

- [x] Web services and remote procedure calls.
- [x] Message-oriented middleware.
- [ ] Physical network cables.
- [ ] Hardware processors.

**Rationale:** The text specifically mentions "logical channels such as web services, remote procedure calls, message-oriented middleware" as examples of logical communication mechanisms.

### (Improved - Physical Channels) What do physical channels represent in the context of the Deployment View?

- [x] The underlying network connections and infrastructure that support logical channels.
- [ ] The software interfaces between components.
- [ ] The user interface elements.
- [ ] The database schema relationships.

**Rationale:** The text refers to "the physical channels on which these [logical channels] are based," indicating that physical channels are the underlying infrastructure supporting logical communication.

### (New - Capacity Planning) What capacity-related aspects are relevant in the Deployment View?

- [x] Network capacity and bandwidth requirements.
- [x] Storage media capacity and expected data volumes.
- [ ] Development team capacity and skills.
- [ ] User interface design capacity.

**Rationale:** The text states "the capacities of networks and storage media are relevant, including the specific data volumes we expect during the execution of our system."

### (New - Operational Benefits) How does the Deployment View specifically assist in operational communication and planning?

- [x] By helping identify system bottlenecks.
- [x] By enabling cost estimation for infrastructure.
- [x] By supporting risk assessment activities.
- [ ] By defining functional requirements.

**Rationale:** The text mentions "This includes identifying bottlenecks, estimating costs, assessing risks and more" as practical aspects that the deployment view supports.

### (New - Availability Documentation) What specific availability-related information should be documented in the Deployment View?

- [x] Planned downtimes for maintenance windows.
- [x] Expected downtimes due to system errors.
- [ ] Development team availability schedules.
- [ ] User support hours and availability.

**Rationale:** The text specifically states "documenting down times due to errors or maintenance windows" as part of availability documentation in the deployment view.

### What is the primary purpose of UML (Unified Modeling Language)?

- [ ] To generate executable code automatically.
- [x] To provide a graphical toolset for visually describing software architecture.
- [ ] To define programming language syntax.
- [ ] To manage project timelines and resources.

**Rationale:** The text states, "UML stands for Unified Modeling Language and is a graphical toolset for visually describing software architecture."

### What are the two main categories of UML diagram types?

- [ ] Functional and Non-functional.
- [x] Structure diagrams and Behavior diagrams.
- [ ] High-level and Low-level.
- [ ] Static and Dynamic.

**Rationale:** The text mentions, "There are two main types, structure diagrams and behavior diagrams."

### Which UML diagram types are primarily used in the "Building Block View" to show static aspects of a system?

- [ ] Sequence Diagram and Communication Diagram.
- [x] Class Diagram, Package Diagram, and Component Diagram.
- [ ] Use Case Diagram and Activity Diagram.
- [ ] Deployment Diagram and Object Diagram.

**Rationale:** The text specifies, "The main structure diagrams are in the building block view, class diagram, package diagram and component diagram."

### Which UML diagram type is used in the "Context View" to show dynamic aspects of the system?

- [ ] Sequence Diagram.
- [ ] Activity Diagram.
- [ ] State Diagram.
- [x] Use Case Diagram.

**Rationale:** The text states, "And finally, in the context view, the use case diagram."

### What is the general benefit of using UML diagrams for visualizing specific aspects of an architecture?

- [ ] They increase the complexity of the modeling process.
- [ ] They are only useful for very small and simple systems.
- [x] They reduce complexity to what is necessary and enhance the clarity of modeling.
- [ ] They eliminate the need for any written documentation.

**Rationale:** The text explains, "Not all of these diagram types are equally prevalent in practice, but they are all suitable for visualizing specific aspects of an architecture, reducing complexity to what is necessary and enhancing the clarity of modeling."

### What is the primary purpose of "Structure diagrams" in UML?

- [ ] To show the dynamic behavior of a system.
- [x] To show the static aspects of a system.
- [ ] To describe the deployment of a system.
- [ ] To illustrate user interactions.

**Rationale:** The text states: "Structure diagrams show the static aspects of a system."

### What is the primary purpose of "Behavior diagrams" in UML?

- [ ] To show the static aspects of a system.
- [x] To show the dynamic behavior of a system.
- [ ] To describe the deployment of a system.
- [ ] To illustrate the physical components of a system.

**Rationale:** The text states: "Behavior diagrams show the dynamic behavior of a system."

### Which UML diagram types are used in the "Runtime View" to show dynamic aspects of a system?

- [x] Sequence Diagram
- [x] Communication Diagram
- [x] Activity Diagram
- [x] State Diagram
- [ ] Class Diagram
- [ ] Package Diagram

**Rationale:** The text lists: "The main behavior diagrams are in the runtime view, sequence diagram, communication diagram, activity diagram and state diagram."

### Which UML diagram type is used in the "Deployment View"?

- [ ] Class Diagram
- [ ] Use Case Diagram
- [x] Deployment Diagram
- [ ] Sequence Diagram

**Rationale:** The text states: "And in the deployment view, the deployment diagram."

### What is the primary purpose of a "Class Diagram" in the building block view?

- [ ] To show the dynamic interactions between objects at runtime.
- [x] To represent the static type structure of an object-oriented system, including classes, interfaces, and their relationships.
- [ ] To organize system elements into cohesive groups at a high level of abstraction.
- [ ] To depict the deployment of software components on hardware.

**Rationale:** The text states, "A class diagram typically represents the static type structure of an object-oriented system, presenting classes, interfaces and their complex relationships such as composition, aggregation and inheritance."

### How do "Package Diagrams" contribute to managing large code bases?

- [ ] By showing the detailed internal logic of each class.
- [x] By organizing system elements into cohesive groups to reduce complexity and depict a more abstract structure.
- [ ] By illustrating the flow of control between different components.
- [ ] By providing a visual representation of the system's performance metrics.

**Rationale:** The text explains, "Package diagrams organize system elements into cohesive groups to reduce complexity and depict a more abstract structure of the system, helping in managing large code bases."

### What level of abstraction do "Component Diagrams" provide compared to Package Diagrams?

- [ ] A lower level of abstraction, showing more detail.
- [x] An even higher level of abstraction, presenting a black box or white box view of components and their wiring.
- [ ] The same level of abstraction, but with different symbols.
- [ ] Component diagrams are not related to package diagrams.

**Rationale:** The text states, "Class diagrams provide an even higher level of abstraction than package diagrams, presenting a black box or white box view of components and how they are wired together."

### How can Class, Package, and Component diagrams be integrated with each other?

- [ ] They cannot be integrated; each diagram type is independent.
- [ ] They are integrated by showing only the most abstract level in all diagrams.
- [x] Classes can contain packages, which can have nested sub-packages, and packages can bundle classes related to other classes, allowing for different levels of detail.
- [ ] Integration is achieved by converting all diagrams into a single, unified format.

**Rationale:** The text explains, "These three diagram types illustrate the same architecture at different levels of abstraction and can be integrated with each other. Classes can contain packages, which in turn can consist of nested sub-packages. Packages can bundle classes that can be intricately related to other classes."

### If classes from Component 1 depend on classes from Component 2, but not vice-versa, what does this imply about the dependency between the components?

- [ ] The components are independent and have no dependency.
- [ ] The dependency flows from Component 2 to Component 1.
- [x] The dependency between components also flows in the same direction, from Component 1 to Component 2.
- [ ] This scenario is not possible in a well-designed architecture.

**Rationale:** The text states, "Given that classes from component 1 depend on classes from component 2, but not vice-versa, the dependency between components also flows in the same direction."

### What kind of relationships are typically shown in a Class Diagram?

- [ ] Only inheritance relationships.
- [x] Complex relationships such as composition, aggregation, and inheritance.
- [ ] Only associations between classes.
- [ ] Only dependencies between packages.

**Rationale:** The text states: "A class diagram typically represents the static type structure of an object-oriented system, presenting classes, interfaces and their complex relationships such as composition, aggregation and inheritance."

### What is the primary purpose of a "Package Diagram"?

- [ ] To show the dynamic behavior of a system.
- [x] To organize system elements into cohesive groups to reduce complexity and depict a more abstract structure.
- [ ] To represent the static type structure of an object-oriented system.
- [ ] To illustrate the deployment of software components.

**Rationale:** The text states: "Package diagrams organize system elements into cohesive groups to reduce complexity and depict a more abstract structure of the system, helping in managing large code bases."

### What is the primary purpose of a "Component Diagram"?

- [ ] To show the internal details of classes.
- [x] To present a black box or white box view of components and how they are wired together.
- [ ] To organize system elements into packages.
- [ ] To illustrate the dynamic interactions between objects.

**Rationale:** The text states: "Class diagrams provide an even higher level of abstraction than package diagrams, presenting a black box or white box view of components and how they are wired together." (Note: The text mistakenly says "Class diagrams" here, but the context clearly refers to Component Diagrams as the higher level of abstraction after Package Diagrams).

### What is the primary purpose of "State Diagrams" in the building block view?

- [ ] To show the physical deployment of components.
- [x] To represent the states of an object and transitions between them, helping to understand the life cycle of an object in reactive systems.
- [ ] To model business processes and workflows.
- [ ] To depict the change in state over time based on triggers.

**Rationale:** The text states, "State diagrams show the states of an object and the transitions between these states. They are used in modelling the behavior of reactive systems like protocol or control software or business software. They especially help in understanding the life cycle of an object."

### For what type of systems are "Timing Diagrams" primarily used?

- [ ] Business process modeling.
- [ ] Object-oriented design.
- [x] Real-time systems and for modeling timing constraints of embedded systems.
- [ ] User interface design.

**Rationale:** The text explains, "Building diagrams depict the change in state or condition of an object over time, based on triggers such as events, signals and messages etc. They are used in real-time systems and for modelling the timing constraints of an embedded system for instance."

### What do "Activity Diagrams" represent, and for what are they used?

- [ ] The static structure of a system's components.
- [x] Workflows of stepwise activities and actions, used for modeling business processes and workflows in software systems.
- [ ] The communication between different software modules.
- [ ] The states of an object over its lifetime.

**Rationale:** The text states, "Activity diagrams represent workflows of stepwise activities and actions. They are used for modelling business processes and workflows in software systems."

### In the example of a state diagram for a meeting, what are the three main states a meeting can be in?

- [ ] Scheduled, Postponed, and Due.
- [x] Active, Has Taken Place, and Cancelled.
- [ ] Started, In Progress, and Finished.
- [ ] Open, Closed, and Archived.

**Rationale:** The text describes the state diagram: "It shows the states of a meeting in a calendar software. A meeting is either active, has taken place or is cancelled."

### According to the state diagram example, when can an active meeting no longer be postponed?

- [ ] As soon as it is scheduled.
- [ ] After it has been cancelled.
- [x] As soon as the start time has passed and the appointment becomes due.
- [ ] Only if it has already taken place.

**Rationale:** The text states, "As soon as the start time has passed the appointment becomes due. Now it cannot be postponed anymore."

### What is the primary purpose of "Behavior Diagrams" in UML?

- [ ] To show the static structure of a system.
- [x] To show the dynamic behavior of a system.
- [ ] To describe the deployment of a system.
- [ ] To illustrate the physical components of a system.

**Rationale:** The text states: "Behavior diagrams show the dynamic behavior of a system."

### What do "Timing Diagrams" depict?

- [ ] The static relationships between objects.
- [x] The change in state or condition of an object over time, based on triggers.
- [ ] The flow of control in a business process.
- [ ] The communication between different software modules.

**Rationale:** The text states: "Building diagrams depict the change in state or condition of an object over time, based on triggers such as events, signals and messages etc."

### What is the primary use case for "Activity Diagrams"?

- [ ] Modeling the states of an object.
- [x] Modeling business processes and workflows in software systems.
- [ ] Showing the timing constraints of embedded systems.
- [ ] Representing the static structure of a system.

**Rationale:** The text states: "Activity diagrams represent workflows of stepwise activities and actions. They are used for modelling business processes and workflows in software systems."

### What is the primary purpose of a "Deployment Diagram"?

- [ ] To show the static structure of software components and their relationships.
- [x] To show an execution architecture consisting of software components (artifacts) deployed on hardware components (nodes).
- [ ] To illustrate the dynamic interactions between objects at runtime.
- [ ] To describe the external context and interfaces of a system.

**Rationale:** The text states: "Deployment diagrams show an execution architecture that consists of software components, called artifacts, that are assigned to and deployed on hardware components, called nodes."

### In a deployment diagram, what do "nodes" represent?

- [ ] Software components or applications.
- [x] Hardware components like devices or execution environments running on a device (e.g., a web browser on a PC).
- [ ] Logical connections between software components.
- [ ] Data flows within the system.

**Rationale:** The text states: "Here nodes are shown as boxes. There can be devices or execution environments running on a device, such as a web browser running on a PC."

### In a deployment diagram, what do "artifacts" represent?

- [ ] Hardware devices or servers.
- [x] Software components that are deployed on nodes or are pre-installed parts of an execution environment.
- [ ] Network connections between nodes.
- [ ] The overall system architecture.

**Rationale:** The text states: "Artifacts are shown as rectangles. They are either deployed on nodes or pre-installed part of an execution environment."

### What is the utility of a deployment diagram for development and operations teams?

- [ ] It helps them design the user interface.
- [x] It helps them understand and assess the execution architecture, and is useful in network architecture design and communication.
- [ ] It provides a detailed view of the internal business logic.
- [ ] It defines the functional requirements of the system.

**Rationale:** The text states: "This is useful in network architecture design and communication. It helps both development and operations in understanding and assessing the execution architecture."

### What is the primary purpose of "Object Diagrams" in the runtime view?

- [ ] To show the static type structure of an object-oriented system.
- [x] To represent instances of classes, showing a snapshot of the system at a particular moment, and to understand object structures at runtime.
- [ ] To depict the internal structure of a class and its collaborations.
- [ ] To illustrate the deployment of software components on hardware.

**Rationale:** The text states: "Object diagrams represent instances of classes, showing a snapshot of the system at a particular moment. They are helpful to understand which object structures a class architecture can imply at runtime."

### Why can "Object Diagrams" sometimes appear simpler than their corresponding "Class Diagrams"?

- [ ] Object diagrams do not show any relationships between objects.
- [x] They show only concrete objects, not complex inheritance hierarchies or abstract interfaces.
- [ ] They are only used for very small systems.
- [ ] They do not represent actual instances of classes.

**Rationale:** The text states: "Nevertheless, object diagrams can look much simpler than the corresponding class diagrams, because they show only concrete objects, not complex inheritance hierarchies or abstract interfaces."

### What is the purpose of "Composite Structure Diagrams"?

- [ ] To show the dynamic behavior of a system over time.
- [x] To depict the internal structure of a class and the collaborations that this structure makes possible, useful for detailed design.
- [ ] To represent the states of an object and transitions between them.
- [ ] To illustrate the flow of control between different activities.

**Rationale:** The text states: "Composite structure diagrams depict the internal structure of a class and the collaborations that this structure makes possible. They are useful for detailed design of a single class or component."

### What is the primary purpose of "Sequence Diagrams" in the runtime view?

- [ ] To show the static structure of a system.
- [x] To show how objects interact in a particular sequence of time, modeling interactions in a use case.
- [ ] To depict the internal structure of a class.
- [ ] To illustrate the deployment of software components.

**Rationale:** The text states: "Sequence diagrams show how objects interact in the particular sequence of time... They are used in modelling the interaction between objects in a certain use case."

### What do "Communication Diagrams" focus on?

- [ ] The chronological order of events.
- [x] The interactions between objects and their structural organization concerning the sending and receiving of messages.
- [ ] The states of an object over its lifetime.
- [ ] The flow of control in a business process.

**Rationale:** The text states: "Communication diagrams focus on the interactions between objects and their structural organization concerning the sending and receiving of messages."

### What is the purpose of "Interaction Overview Diagrams"?

- [ ] To show simple, linear interactions.
- [x] To combine elements of activity and sequence diagrams to show control flow with nodes that can contain interaction diagrams, useful for modeling complex interactions.
- [ ] To depict the static relationships between classes.
- [ ] To illustrate the deployment of software on hardware.

**Rationale:** The text states: "Interaction overview diagrams combine elements of activity and sequence diagrams to show control flow with nodes that can contain interaction diagrams. They are helpful to model complex interactions within a system."

### What is a common drawback of Sequence Diagrams, despite their utility?

- [ ] They are too simple to convey meaningful information.
- [x] They quickly become complex and often can only depict a small portion of a use case with a limited number of objects involved.
- [ ] They only show static relationships, not dynamic behavior.
- [ ] They are rarely used in practice.

**Rationale:** The text states: "Sequence diagrams are excellent for understanding the dynamic behavior of a system. However, they quickly become complex and often can only depict a small portion of a use case with a limited number of objects involved."

### In a Sequence Diagram, how are method invocations and returns typically represented?

- [ ] Both are represented by dashed arrows.
- [x] Method invocations are represented by solid arrows, and returns are shown as dashed arrows.
- [ ] Both are represented by solid arrows.
- [ ] Method invocations are represented by dashed arrows, and returns are shown as solid arrows.

**Rationale:** The text states: "The method invocation is represented by a solid arrow... The returns are shown as dashed arrows."

### What is the primary purpose of "Use Case Diagrams" in the context view?

- [ ] To show the internal structure of the system.
- [x] To depict the relationships of actors and use cases within the system, and to document user goals and interactions.
- [ ] To illustrate the deployment of software components.
- [ ] To model the dynamic behavior of objects at runtime.

**Rationale:** The text states: "Use case diagrams depict the relationships of actors and use cases within the system. Use case diagrams enable detailed documentation of the primary goals of the users and their manifold interactions within the system."

### How can "Use Cases" be managed in a Use Case Diagram?

- [ ] They must always be kept as single, atomic units.
- [x] They can be decomposed into smaller ones, extended, and generalized.
- [ ] They can only be extended, not decomposed.
- [ ] They are static and cannot be changed once defined.

**Rationale:** The text states: "Use cases can be decomposed into smaller ones or extended and generalized."

### What is the utility of "Use Case Diagrams" for requirements gathering and communication?

- [ ] They are primarily used for technical implementation details.
- [x] They are valuable for gathering and communicating requirements and effectively breaking down the functionality of a system.
- [ ] They are only useful for very small systems.
- [ ] They replace the need for any other form of documentation.

**Rationale:** The text states: "Use case diagrams are valuable for gathering and communicating requirements and effectively break down the functionality of a system."

### What is a limitation of UML regarding the Context View?

- [ ] It does not support any behavior diagrams for the context view.
- [x] There is no UML support for structure diagrams in the context view.
- [ ] It only supports the deployment view.
- [ ] It cannot represent external actors.

**Rationale:** The text states: "However, there is no UML support for structure diagrams in the context view."

### What are some non-UML alternatives for structure diagrams in the Context View?

- [ ] Class diagrams and sequence diagrams.
- [x] IT landscape and structured interface documentation.
- [ ] Activity diagrams and state diagrams.
- [ ] Deployment diagrams and component diagrams.

**Rationale:** The text states: "Instead, there are non-UML alternatives, such as the IT landscape and structured interface documentation."

### In the domain view, what documents the domain language, and what is its purpose according to domain-driven design?

- [ ] Sequence diagrams, to show interactions.
- [x] A glossary, to impose structure on the architecture.
- [ ] Component diagrams, to show static structure.
- [ ] Deployment diagrams, to show physical deployment.

**Rationale:** The text states: "In the domain view, a glossary documents the domain language, which, according to domain-driven design, is intended to impose structure on the architecture."

### What does the "Emergent Domain-Driven Architecture" (EDDA) aim to integrate?

- [ ] Only structural aspects of the architecture.
- [ ] Only behavioral aspects of the architecture.
- [x] Both domain and technical views (like building block and deployment views), as well as structural and behavioral aspects, for a consistent representation.
- [ ] Only UML diagrams.

**Rationale:** The text states: "The emergent domain-driven architecture, or just adder, integrates both the domain view and technical views, such as the building block view and deployment view. It also integrates structural and behavioral aspects. It aims for a consistent and meaningful representation of the architecture from multiple perspectives."

### What are two general views that can be documented with Architectural Decision Records (ADR) and the ARC 42 standard structure?

- [ ] Only functional requirements.
- [x] Structural and behavioral aspects of software architecture.
- [ ] Only technical implementation details.
- [ ] Only project management timelines.

**Rationale:** The text states: "A general view on software architecture can be documented with Architectural Decision Records, or ADR, and the ARC 42 standard structure, both of which cover structural and behavioral aspects."

### What is an "IT landscape" described as a mixture of?

- [ ] Class diagrams, sequence diagrams, and activity diagrams.
- [x] Building block view, deployment view, and context view.
- [ ] Functional requirements, non-functional requirements, and business processes.
- [ ] Hardware, software, and network components.

**Rationale:** The text states: "An IT landscape can be seen as a mixture of building block view, deployment view and context view."

### What is the primary goal of creating a graphical overview of an IT landscape?

- [ ] To replace all other forms of documentation.
- [x] To allow pinpointing specific areas for improvement within the company's IT.
- [ ] To detail the internal implementation of every system.
- [ ] To provide a historical record of IT changes.

**Rationale:** The text states: "The goal is to create a graphical overview that allows pinpointing specific areas for improvement."

### Which of the following are examples of relevant aspects broadly described in an IT landscape?

- [x] Interplay of systems and processes.
- [x] Infrastructure elements and devices.
- [x] Exchange of key business objects.
- [x] Actors and organizational structures.
- [ ] Detailed source code of applications.
- [ ] Individual developer performance metrics.

**Rationale:** The text states: "It broadly describes the interplay of systems, processes, infrastructure elements, devices, media, exchange key business objects, actors, organizational structures, etc. Or any other relevant aspect within company IT."

### What is an example of a problem area that an IT landscape might highlight in the "portal area"?

- [ ] The production line is cumbersome.
- [x] The portal system requires high maintenance effort and the portal UI suffers from poor usability.
- [ ] The internal DB client is inconsistent.
- [ ] The network infrastructure is outdated.

**Rationale:** The text states: "For example in the portal area we see that the portal system requires high maintenance effort and that the portal UI suffers from poor usability."

### What is an example of a problem area that an IT landscape might highlight in the "production area"?

- [ ] The portal system requires high maintenance effort.
- [x] The process implemented by the production line is rather cumbersome and the usability of the internal DB client is inconsistent.
- [ ] The network infrastructure is outdated.
- [ ] The external systems are not integrated.

**Rationale:** The text states: "In the production area the process implemented by the production line is rather cumbersome and the usability of the internal DB client is inconsistent."

### What is the primary purpose of "Interface Documentation"?

- [ ] To describe the internal implementation details of a building block.
- [x] To provide a clear and precise description of all information necessary to use or implement an interface.
- [ ] To define the programming language used for an interface.
- [ ] To manage the deployment of interfaces.

**Rationale:** The text states: "Interface documentation should provide a clear and precise description of all information necessary to use or implement an interface."

### Where can interface documentation be located?

- [ ] Only as a standalone document.
- [x] As standalone documentation or as part of other views, such as the context view.
- [ ] Only embedded within the source code.
- [ ] Only in a centralized database.

**Rationale:** The text states: "It may be standalone documentation that accompanies the interface or can be part of other views, such as the context view which describes how the system is embedded in its environment."

### Which of the following are examples of information that should be included in interface documentation under "Resources, syntax, semantics, restrictions"?

- [ ] The name and version of the interface.
- [x] "Get users" to retrieve user information.
- [ ] Error scenarios like 404.
- [ ] Configuration parameters like max results for pagination.

**Rationale:** The text states: "resources, syntax semantics restrictions, for instance get users to retrieve user information"

### What kind of information is typically found under the "Quality, service requirements" section of interface documentation?

- [ ] Instructions and examples for usage.
- [x] Non-functional requirements like "99.9% uptime for availability."
- [ ] Design considerations like choosing a RESTful architecture.
- [ ] Error handling procedures.

**Rationale:** The text states: "quality, service requirements, for instance 99.9% uptime for availability."

### What kind of information is typically found under the "Usage notes, instructions and examples" section of interface documentation?

- [ ] The name and version of the interface.
- [ ] Error scenarios and handling.
- [ ] Design considerations.
- [x] Instructions and examples for using the interface, such as "use API key for authentication."

**Rationale:** The text states: "Usage notes, instructions and examples, for instance use API key for authentication."

### What is the primary purpose of a "Glossary" in the context of software architecture documentation?

- [ ] To list all technical terms used in the project.
- [x] To document the vocabulary of the domain language and make it accessible to everyone.
- [ ] To define programming language syntax.
- [ ] To track changes in the codebase.

**Rationale:** The text states: "The glossary helps to document the vocabulary of domain language. ... A glossary can document the current state in order to make the domain language accessible to everyone."

### According to domain-driven design, how does the domain language influence software architecture?

- [ ] It has no influence; architecture is purely technical.
- [x] It directly reflects the terms, structures, and semantics of the business domain, shaping the software architecture.
- [ ] It only affects the user interface design.
- [ ] It is only used for communication between developers.

**Rationale:** The text states: "According to domain-driven design, the software architecture is shaped by domain language. It directly reflects the terms, structures and semantics of the business domain it is intended to support."

### Why is it important to define and explain relevant terms in a glossary, especially when dealing with different domains or synonyms?

- [ ] To make the glossary as long as possible.
- [x] Because even if terms are the same, their meaning can differ across domains, and synonyms or new conceptions exist within the same domain.
- [ ] To ensure that only technical experts can understand the documentation.
- [ ] To prevent any new terms from being introduced.

**Rationale:** The text states: "This requires to define and explain the relevant terms of the domain. Each domain has its own domain language. This means that even if the terms may be the same, the meaning can be different. But even within the same domain there are synonyms, generalizations and new conceptions of domain language terms."

### What is the advice regarding generalizations in the domain language?

- [ ] Generalizations should be avoided entirely.
- [x] They must make sense to the domain experts.
- [ ] They should only be created by technical architects.
- [ ] They are only for internal documentation.

**Rationale:** The text states: "Note that these generalizations must make sense to the domain experts."

### Besides vocabulary, what is needed to truly master a language, as suggested by the text?

- [ ] Reading a dictionary.
- [x] Speaking the language, for example, by telling stories in that language.
- [ ] Memorizing all grammatical rules.
- [ ] Translating it into another language.

**Rationale:** The text states: "However, language is more than its vocabulary. To truly master a language it must be spoken. For example, by telling stories in that language."

### What is the primary purpose of "Scenarios and Visions" in software architecture documentation?

- [ ] To provide a detailed technical specification of the system.
- [x] To tell exemplary stories from the business domain in a narrative form, describing typical or interesting episodes.
- [ ] To define the programming language to be used.
- [ ] To manage project timelines and resources.

**Rationale:** The text states: "Scenarios and visions tell exemplary stories from the business domain in a narrative form. They describe typical or particularly interesting episodes from the business domain."

### How do scenarios and visions facilitate communication between project participants?

- [ ] By eliminating the need for any verbal communication.
- [x] By creating precedent cases that people can discuss and clarify with each other, making unclear aspects and unknown terms easier to identify.
- [ ] By providing a rigid set of rules for interaction.
- [ ] By automating the entire communication process.

**Rationale:** The text states: "This makes it easy to recognize unclear aspects and ask questions about them. Unknown terms can also be easily identified and subsequently clarified. Overall, scenarios and visions facilitate better communication between project participants, especially between domain experts and developers, by creating precedent cases that people can discuss and clarify with each other."

### What is the difference between scenarios that depict the "current situation" and those that describe a "desired situation"?

- [ ] Scenarios of the current situation are always more detailed.
- [x] Scenarios of the current situation describe the work context and business processes, while those of a desired situation (visions) illustrate how the desired system is to be used.
- [ ] Scenarios of the current situation are only for developers, while visions are for users.
- [ ] There is no difference; the terms are interchangeable.

**Rationale:** The text states: "Scenarios that depict the current situation describe the work context and the business processes in which the current actors are involved. ... Scenarios that describe a desired situation are often called visions. In many cases, they illustrate how the desired system is to be used in a known context, so the business process is well known, but the solution is envisioned."

### What is an "open design scenario" and what is its purpose?

- [ ] A scenario that is left incomplete for future development.
- [x] A type of vision where an imaginary context is used to unleash creativity and lead to entirely new solutions.
- [ ] A scenario that is open to interpretation by different stakeholders.
- [ ] A scenario that describes a system with no predefined context.

**Rationale:** The text states: "Another type of vision is called open design scenario. Here, we intentionally leave the familial territory behind to develop system visions for an imaginary context. This can unleash creativity in the design process and lead to entirely new solutions."

### How do scenarios contribute to modern collaborative modeling methods like domain storytelling?

- [ ] They replace the need for such methods.
- [x] They form the foundation for gaining a deep understanding of the domain and developing tailored software.
- [ ] They are only used for formal documentation.
- [ ] They are irrelevant for collaborative modeling.

**Rationale:** The text states: "Scenarios can be key to gaining a deep understanding of the domain and developing tailored software for it. As such, they form the foundation for many modern collaborative modeling methods, such as domain storytelling."

### What is "Domain Storytelling" as a collaborative modeling method?

- [ ] A method for writing technical documentation for developers.
- [x] A method for narrating scenarios collaboratively with domain experts and other stakeholders, visualizing individual steps.
- [ ] A technique for automating software development.
- [ ] A way to generate code from natural language descriptions.

**Rationale:** The text states: "Domain storytelling is a collaborative modeling method for narrating scenarios collaboratively with domain experts and other stakeholders, intuitively visualizing the individual steps of the scenario."

### What question does a domain story aim to answer?

- [ ] How much does the project cost?
- [x] Who does what with which work objects?
- [ ] What programming language should be used?
- [ ] When will the project be completed?

**Rationale:** The text states: "A domain story answers the question of who does what with which work objects."

### In the example of guiding container ships, what is the role of the "sounding team"?

- [ ] To pilot the container ships.
- [x] To measure depths and calculate depth lines to create a sounding plan.
- [ ] To find specific routes for container ships.
- [ ] To contact the captain for a route.

**Rationale:** The text states: "First, a sounding vessel measures depths along the river Elbe and sends these measurements to the sounding team in Hamburg. The sounding team then calculates depth lines and creates a sounding plan."

### How does the nautical officer find a suitable route for a container ship?

- [ ] By randomly selecting a route.
- [x] By putting the ship silhouette on the sounding plan, shifting and rotating it to simulate concrete maneuvers.
- [ ] By consulting a pre-defined database of routes.
- [ ] By asking the captain for their preferred route.

**Rationale:** The text states: "The officer puts the ship silhouette on the sounding plan, shifting and rotating it to simulate concrete maneuvers and eventually find a suitable route."

### What is the benefit of breaking down the domain into subdomains based on process segments?

- [ ] It makes the domain more complex.
- [x] It allows for understanding how these subdomains interact and how they can be separated, serving as a blueprint for architecture design.
- [ ] It eliminates the need for any further analysis.
- [ ] It forces all subdomains to be implemented by the same team.

**Rationale:** The text states: "Based on the coherence of process segments, it serves as a solid foundation for breaking down the domain into subdomains... This breakdown of the domain into subdomains follows the principle of divide and conquer. It allows us to understand how these subdomains interact within the context of the domain story and also how they can be separated from each other. This subdomain topology is an excellent blueprint for architecture design."

### What does EDDA stand for, and what is its purpose?

- [ ] Enterprise Data-Driven Architecture; to manage large datasets.
- [x] Emergent Domain-Driven Architecture; to support the gradual development of a domain-driven design architecture.
- [ ] Event-Driven Design Analysis; to analyze event flows.
- [ ] Extended Deployment Diagram Analysis; to visualize deployment details.

**Rationale:** The text states: "Adder stands as an acronym for emergent domain-driven architecture. ... The adder diagram type supports the gradual development of a domain-driven design architecture."

### In the cinema domain example, what are the three sub-domains identified that require software development?

- [ ] Payment processing, accounting, and film distribution.
- [x] Seat reservation, ticket purchase, and weekly schedule.
- [ ] Ticket service, payment service, and accounting service.
- [ ] North Sea, River Elbe, and Hamburg harbor.

**Rationale:** The text states: "Let's consider the cinema domain as an example, where we've identified the following three sub-domains seat reservation, ticket purchase and weekly schedule, all shown as green rectangles. These three domains require software development."

### How does the interconnection of sub-domains arise in an EDDA diagram?

- [ ] From random connections between components.
- [x] From the examined scenarios, specifically from events and commands.
- [ ] From the technical dependencies of the underlying infrastructure.
- [ ] From the organizational structure of the development team.

**Rationale:** The text states: "The interconnection of these sub-domains arises from the examined scenarios. ... The orange and blue stickies indicate the necessary links between the sub-domains arising from the events and commands in the scenarios we considered."

### What is the significance of the "subdomain topology" in EDDA?

- [ ] It is only for visual representation and has no practical use.
- [x] It serves as an excellent blueprint for architecture design, allowing concrete software systems or modules to be mapped onto it.
- [ ] It dictates the specific programming languages to be used.
- [ ] It replaces the need for any technical architecture.

**Rationale:** The text states: "The topology of these sub-domains now serves as a blueprint on which we can map out concrete software systems or modules."

### What is the difference in approach to aligning technical architecture with subdomain structure between a Greenfield project and a Brownfield project?

- [ ] In both, exact alignment is always preferred.
- [x] In a Greenfield project, exact alignment is preferred, while in a Brownfield project, the aim is to align as closely as possible.
- [ ] In a Greenfield project, alignment is not necessary, while in a Brownfield project, it is crucial.
- [ ] In both, alignment is impossible.

**Rationale:** The text states: "It's up to us to decide how closely we want to align our technical architecture with a sub-domain structure. In the Greenfield project, exact alignment is preferred, whereas in a Brownfield project, we aim to align as closely as possible."

### What is the starting point for making good architectural decisions?

- [ ] Immediately choosing the most popular solution.
- [x] A good understanding of the problem.
- [ ] Relying solely on past experiences.
- [ ] Ignoring all external influences.

**Rationale:** The text states: "A good understanding of the problem is the starting point for any solution finding."

### Which of the following questions are crucial for understanding the problem when making architectural decisions?

- [ ] What is the project budget?
- [x] What exactly is the problem?
- [x] Why is it relevant to the architecture?
- [x] How will the decision affect the problem?
- [ ] Who will implement the solution?

**Rationale:** The text states: "What exactly is the problem? Why is it relevant to the architecture? How will the decision affect the problem?"

### What are some influencing factors beyond the problem that impact solution finding for architectural decisions?

- [ ] Personal preferences of the architect.
- [x] Constraints, quality goals, and risks addressed.
- [ ] The latest technology trends.
- [ ] The number of developers available.

**Rationale:** The text states: "What constraints are given? What quality goals apply? What risks are addressed?"

### What is the purpose of making assumptions in architectural decision-making?

- [ ] To avoid making any decisions.
- [x] To deal with what is unknown and cannot be answered, and to identify new risks.
- [ ] To simplify the problem by ignoring complex details.
- [ ] To ensure that the solution is always perfect.

**Rationale:** The text states: "We make assumptions for what we don't know and cannot answer. What assumptions were made? Which assumptions can be verified upfront? And quite specifically, what new risks arise from the decision?"

### What is the benefit of considering alternative solutions when making architectural decisions?

- [ ] It makes the decision-making process longer and more complicated.
- [x] It helps to work out pros and cons, to get inspired, to identify more risks, and to ensure no solution alternatives were overlooked.
- [ ] It guarantees that the first solution considered is always the best.
- [ ] It eliminates the need for any further evaluation.

**Rationale:** The text states: "Considering alternative solutions helps to work out pros and cons, to get inspired, to identify more risks and to ultimately ensure that no solution alternatives were overlooked."

### What is the primary purpose of "Architectural Decision Records" (ADRs)?

- [ ] To replace all other forms of architecture documentation.
- [x] To document, communicate, and learn from architectural decisions, promoting consistency and risk management.
- [ ] To automatically generate code from architectural decisions.
- [ ] To track individual developer performance.

**Rationale:** The text states: "Architecture decision records, ADRs, are valuable for documenting, communicating and learning from architectural decisions. They promote consistency and risk management and serve as a reference for understanding and assessing the current architecture."

### Which of the following are typical components of an ADR's structure?

- [x] Title, Context, Decision, Status, Consequences, Author and Date.
- [ ] Project budget, team members, and daily tasks.
- [ ] Source code snippets and test results.
- [ ] User interface mockups and wireframes.

**Rationale:** The text states: "ADRs typically have the following structure, title, a brief label for the architectural decision, context, factors such as technical, organizational and social influences, decision, a concise prose description of the decision, status, indicating whether the ADR is proposed, accepted or deprecated if replaced by a newer version, consequences, expected positive or negative impacts of the decision, or identified risks if uncertain, author and date, the creator and the recording date of the ADR, and more, such as alternatives considered, references, etc."

### What is the purpose of the "Context" section in an ADR?

- [ ] To provide a brief label for the decision.
- [x] To describe factors such as technical, organizational, and social influences that led to the decision.
- [ ] To state the final decision concisely.
- [ ] To list the expected positive or negative impacts.

**Rationale:** The text states: "context, factors such as technical, organizational and social influences".

### What does the "Status" field in an ADR indicate?

- [ ] The current progress of the implementation.
- [x] Whether the ADR is proposed, accepted, or deprecated (if replaced by a newer version).
- [ ] The level of urgency of the decision.
- [ ] The number of people who agree with the decision.

**Rationale:** The text states: "status, indicating whether the ADR is proposed, accepted or deprecated if replaced by a newer version".

### How do ADRs help in understanding the evolution of architecture over time?

- [ ] They automatically update the architecture diagrams.
- [x] They help understand why architecture evolved in a specific way, even after a long time, by providing context and justification for decisions.
- [ ] They eliminate the need for any historical records.
- [ ] They only document the final state of the architecture.

**Rationale:** The text states: "ADRs help us understand why architecture evolved in a specific way, even after a long time we can understand why decisions were made and the context they were made in, which helps us re-evaluate them from today's perspective."

### What are the two main parts of architecture documentation, as described in the text?

- [ ] User manuals and technical specifications.
- [x] The central architecture description and the architecture overview.
- [ ] Design patterns and architectural styles.
- [ ] Functional requirements and non-functional requirements.

**Rationale:** The text states: "Architecture documentation consists of several parts. A main part is the central architecture description. ... Another main part is the architecture overview, which is concise and limited to a maximum of 30 pages."

### What is the primary characteristic of the "central architecture description"?

- [ ] It is limited to a maximum of 30 pages.
- [x] It is very detailed and encompasses all relevant information about the architecture, including objectives, quality requirements, design decisions, and utilized patterns.
- [ ] It is primarily used for communicating with non-technical stakeholders.
- [ ] It is only created for a specific purpose and not maintained over time.

**Rationale:** The text states: "A main part is the central architecture description. It is very detailed and compassing all relevant information about the architecture, including its objectives, quality requirements, design decisions and utilized patterns."

### What is the primary characteristic of the "architecture overview"?

- [ ] It is very detailed and comprehensive.
- [x] It is concise and limited to a maximum of 30 pages, outlining fundamental structures and key decisions.
- [ ] It is only for internal use by the development team.
- [ ] It replaces the need for the central architecture description.

**Rationale:** The text states: "Another main part is the architecture overview, which is concise and limited to a maximum of 30 pages. Despite its brevity, it motivates the architecture, outlines fundamental structures, highlights the key architectural decisions and explains the system's functional principles."

### What is the purpose of the "architecture wallpaper"?

- [ ] To serve as a decorative element in the office.
- [x] A large diagram combining building block and deployment views, showcasing multiple architecture aspects in one visual.
- [ ] A detailed textual description of the system's architecture.
- [ ] A document for tracking project progress.

**Rationale:** The text states: "The architecture wallpaper is a large diagram, combining building block and deployment views, showcasing multiple architecture aspects in one visual."

### What is the primary purpose of the "manual for architecture documentation"?

- [ ] To provide a high-level overview for stakeholders.
- [x] To serve as a practical handbook for those who maintain the documentation, defining structures, syntax, and semantics of use.
- [ ] To describe the functional requirements of the system.
- [ ] To automate the documentation process.

**Rationale:** The text states: "The manual for architecture documentation is a practical handbook for those who actually maintain the documentation. It defines structures, syntax and semantics of use, often referring to standard diagram types like UML."

### What are the two main categories of quality requirements for good architecture documentation?

- [ ] High-level and low-level.
- [x] Functional and non-functional.
- [ ] Technical and business.
- [ ] Internal and external.

**Rationale:** The text states: "Good architecture documentation needs to meet specific quality requirements. Some are functional and primarily focus on answering concrete questions about architecture and technical aspects. Others are non-functional."

### Which of the following are examples of non-functional quality requirements for architecture documentation?

- [x] Up-to-date and correct.
- [x] Suitable for its target group.
- [x] Clear and comprehensible.
- [x] Brief and compact.
- [x] Efficient to read and write.
- [x] Maintainable and cost-efficient.
- [ ] Answering concrete questions about architecture.

**Rationale:** The text lists: "For example, architecture documentation should be up-to-date, correct, suitable for its target group, clear and comprehensible, brief and compact, efficient to read and write, maintainable and cost efficient."

### What is the advice regarding sections of standard documentation structures that are left blank?

- [ ] They should be deleted to keep the document concise.
- [x] They should be marked with "not applicable" to avoid oversight.
- [ ] They should be filled with placeholder text.
- [ ] They indicate that the documentation is incomplete.

**Rationale:** The text states: "Keep in mind that any sections of these standard structures that are left blank should be marked with not applicable to avoid oversight."

### What is the recommended perspective to adopt when writing architecture documentation?

- [ ] The architect's perspective.
- [ ] The project manager's perspective.
- [x] The reader's perspective.
- [ ] The developer's perspective.

**Rationale:** The text states: "Always write from the reader's perspective, because that's who the documentation is written for."

### What is the advice regarding the size and clarity of diagrams in architecture documentation?

- [ ] Diagrams should be as large as possible to show all details.
- [ ] Diagrams should only contain text, no visual elements.
- [x] Use small diagrams focusing on 5 to 9 elements to make them clearer and easier to understand.
- [ ] Diagrams should be generated automatically without any manual review.

**Rationale:** The text states: "Use small diagrams focusing on 5 to 9 elements to make them clearer and easier to understand."

### What is the primary purpose of the ARC42 standard?

- [ ] To define a specific programming language for software development.
- [x] To provide a comprehensive framework for documenting software architectures, ensuring clarity, consistency, and completeness.
- [ ] To automate the process of software deployment.
- [ ] To manage project budgets and timelines.

**Rationale:** The text states: "The ARG42 standard provides a comprehensive framework for documenting software architectures, ensuring clarity, consistency and completeness in communicating architectural decisions."

### Which of the following sections are typically included in an ARC42 documentation?

- [x] Introduction and goals.
- [x] Constraints.
- [x] Context and scope.
- [x] Solution strategy.
- [x] Building block view.
- [x] Runtime view.
- [x] Deployment view.
- [x] Crosscutting concepts.
- [x] Architectural decisions.
- [x] Quality requirements.
- [x] Glossary.
- [ ] Detailed code implementation.

**Rationale:** The text lists all these sections: "It typically includes the following sections. Introduction and goals... Constraints... Context and scope... Solution strategy... Building block view... Runtime view... Runtime view, hardware infrastructure and deployment... Crosscutting concepts... Architectural decisions... Quality requirements... Glossary..."

### What is the purpose of the "Quality requirements" section in ARC42?

- [ ] To list all functional requirements.
- [x] To provide a hierarchical breakdown of quality criteria (quality tree) and quality scenarios illustrating those criteria.
- [ ] To define the testing strategy for the system.
- [ ] To document the project's budget.

**Rationale:** The text states: "Quality requirements, a hierarchical breakdown of quality criteria known as quality tree and quality scenarios illustrating those criteria."

### What is the purpose of the "Glossary" section in ARC42?

- [ ] To list all technical terms.
- [x] To document important domain terms in domain design, known as ubiquitous language.
- [ ] To provide a list of all external systems.
- [ ] To define the project's acronyms.

**Rationale:** The text states: "Glossary, documenting important domain terms in domain design known as ubiquitous language."

### What are the general benefits of using a standard structure like ARC42 for architecture documentation?

- [ ] It forces all projects to use the same architectural style.
- [x] It promotes consistency, ensures completeness, and increases efficiency by minimizing structuring effort and facilitating navigation.
- [ ] It eliminates the need for any human review of the documentation.
- [ ] It automatically generates all required diagrams.

**Rationale:** The text states: "ARG42 like all standard structures promotes consistency within documentation, ensures completeness and increases efficiency by minimizing structuring effort and facilitating navigation within familiar documentation formats."

### What is crucial for effective communication of architecture among stakeholders?

- [ ] Using only one communication channel.
- [x] Consistency between documentation and communication, both in terms of terminology and reasoning.
- [ ] Avoiding any written communication.
- [ ] Relying solely on verbal communication.

**Rationale:** The text states: "Consistency between documentation and communication is crucial, both in terms of terminology and reasoning."

### Which of the following are examples of verbal communication channels for architecture?

- [x] Meetings.
- [x] Spontaneous discussions.
- [x] Lunchtime talks.
- [x] Mob programming sessions.
- [ ] Email.
- [ ] Formal documentation.

**Rationale:** The text states: "For example, it can be communicated verbally in meetings, spontaneous discussions, lunchtime talks, mob programming sessions, etc."

### What is an advantage of verbal communication, particularly in revealing misunderstandings?

- [ ] It is always recorded for future reference.
- [x] Non-verbal signals like gestures and facial expressions can reveal misunderstandings or issues, allowing them to be addressed immediately.
- [ ] It is always more formal than written communication.
- [ ] It eliminates the need for any follow-up.

**Rationale:** The text states: "Verbal communication includes non-verbal signals. Gestures and facial expressions can reveal misunderstandings or issues, allowing them to be addressed immediately."

### What is the primary advantage of written communication for architecture?

- [ ] It is always faster than verbal communication.
- [x] It allows for the use of graphical representations, where a picture often says more than a thousand words.
- [ ] It eliminates the need for any verbal discussions.
- [ ] It is always more engaging for stakeholders.

**Rationale:** The text states: "The advantage of written communication lies in the ability to use graphical representations. A picture often says more than a thousand words."

### What is a potential drawback of asynchronous communication?

- [ ] It always leads to immediate feedback.
- [x] Longer communication cycles can be an unwanted result.
- [ ] It requires all participants to be online simultaneously.
- [ ] It eliminates the need for any documentation.

**Rationale:** The text states: "In asynchronous communication, everyone can communicate when they have the time. Longer communication cycles can be an unwanted result, though."

### What are the key requirements for good architecture documentation?

- [ ] It must be as long as possible.
- [x] It must be system-specific, accurate and consistent, appropriate, maintainable and efficient, tailored to the target group and understandable.
- [ ] It must be written by a single architect.
- [ ] It must only contain technical details.

**Rationale:** The text states: "Architecture documentation must be system-specific, accurate and consistent, appropriate, maintainable and efficient, tailored to the target group and understandable."

### What is the advice regarding the use of templates in architecture documentation?

- [ ] Templates should be avoided to allow for maximum flexibility.
- [x] Use templates when helpful in context-building-block-run-time-deployment-view, clearly describing internal and external interfaces, and differentiating technical and business contexts.
- [ ] Templates are only for very small projects.
- [ ] Templates should be used to hide complex details.

**Rationale:** The text states: "Using templates when helpful in context-building-block-run-time-deployment-view, clearly describing internal and external interfaces, differentiating technical and business contexts."

### What is the advice regarding architectural decisions in documentation?

- [ ] Architectural decisions should not be documented.
- [x] Document and communicate them with all their dependencies, and justify them.
- [ ] Only document the final decision, not the alternatives considered.
- [ ] Architectural decisions are only relevant for the initial design phase.

**Rationale:** The text states: "This guide and justify architectural decisions, documenting and communicating them with all their dependencies."

### What is the primary focus of Chapter 4, as introduced by Dela?

- [ ] Software development methodologies.
- [x] The quality of an architecture and how to evaluate it.
- [ ] Project management techniques.
- [ ] Specific programming languages.

**Rationale:** The text states: "This chapter is about the quality of an architecture and how to evaluate it."

### What will be the basis for evaluating quality in this chapter?

- [ ] Code reviews.
- [x] Scenarios derived from quality characteristics organized in utility trees.
- [ ] Automated testing.
- [ ] User feedback.

**Rationale:** The text states: "We get to know quality characteristics, how to organize them in utility trees and how to derive scenarios from them. The scenarios will be the basis for evaluating quality."

### What method for quality assessment will be learned in this chapter?

- [ ] Agile Scrum.
- [x] The Architecture Trade-off Analysis Method (ATAM).
- [ ] Test-Driven Development (TDD).
- [ ] Domain-Driven Design (DDD).

**Rationale:** The text states: "We will continue by learning a method for quality assessment, the architecture trade-off analysis method, or in short, ATEM."

### What is the primary focus of this chapter regarding software architecture?

- [ ] Software development methodologies.
- [x] The quality of software architectures and how to ensure it.
- [ ] Project management techniques.
- [ ] Specific programming languages.

**Rationale:** The text states: "In this chapter, we look at the quality of software architectures. We explain why software quality is so important and how to ensure it."

### What types of evaluation methods for software architectures will be introduced in this chapter?

- [ ] Only qualitative methods.
- [ ] Only quantitative methods.
- [x] Qualitative and quantitative evaluation methods.
- [ ] Only automated evaluation methods.

**Rationale:** The text states: "We introduce qualitative and quantitative evaluation methods for software architectures and discuss one method, ATEM, in detail."

### What specific method for quality assessment will be discussed in detail?

- [ ] Agile Scrum.
- [x] ATEM (Architecture Trade-off Analysis Method).
- [ ] Test-Driven Development (TDD).
- [ ] Domain-Driven Design (DDD).

**Rationale:** The text states: "We introduce qualitative and quantitative evaluation methods for software architectures and discuss one method, ATEM, in detail."

### What topic will be the starting point for discussing the quality of software architectures in this chapter?

- [ ] Software design patterns.
- [x] Technical debt.
- [ ] User interface design.
- [ ] Database management.

**Rationale:** The text states: "So, let's start having a look on the quality of software architectures, beginning with the term technical depth."

### What is "Technical Debt"?

- [ ] The cost of fixing bugs in the future.
- [x] The implied cost of future rework when not choosing the optimal solution for current and future needs.
- [ ] The amount of money owed to software developers.
- [ ] The time spent on writing documentation.

**Rationale:** The text states: "Technical depth is the implied cost of future rework when we develop a software system and do not choose the optimal solution for our current and future needs."

### When does technical debt become a problem?

- [ ] Always, regardless of how it's managed.
- [x] Only if you don't care for it and it grows unchecked.
- [ ] Only when the system is very small.
- [ ] Only when new features are added.

**Rationale:** The text states: "Because technical depth is an inherent part of the software development process, it is only a problem if you don't care of it."

### What is the goal when managing technical debt, as shown in the diagram?

- [ ] To eliminate all technical debt immediately.
- [x] To always stay within the corridor of low technical debt, where it can be eliminated with little effort.
- [ ] To allow technical debt to grow indefinitely.
- [ ] To ignore technical debt until it causes a system crash.

**Rationale:** The text states: "Our goal is to always stay within the corridor of low technical depth, as shown in the diagram. Depth of this magnitude can be eliminated with little effort and costs."

### What happens if no "architectural renewal" is carried out regularly?

- [ ] The system remains perfectly maintainable.
- [x] The system will erode, and the higher the technical debt, the faster the erosion will progress, leading to unmaintainable software.
- [ ] The cost of extensions will decrease over time.
- [ ] New features can be added with linear expense.

**Rationale:** The text states: "But if no architectural renewal is carried out, the system will erode. The higher the technical depth, the faster the erosion will progress. We will end up with a system that is not maintainable anymore, and every change and extension costs more time than the previous one."

### Which of the following are reasons for software erosion?

- [x] Architecture-violating dependencies arising unnoticed.
- [x] Coupling and complexity growing faster than expected.
- [x] Time pressure leading to shortcuts that are never replaced.
- [x] Internal software quality not being important to project management.
- [x] Reusing existing applications for new purposes without optimization.
- [x] No time to discuss and renew software architecture.
- [x] Inability to manually identify all architecture violations.
- [x] Unequal understanding and knowledge within the team, exacerbated by outsourcing.
- [ ] Regular architectural renewal.

**Rationale:** The text lists these reasons: "First of all, architecture violating dependency often arise unnoticed... The degree of coupling and complexity in the project often grow faster than expected... Time pressure leads to shortcuts that are usually never replaced by clean solutions later. The internal software quality is often not important to project management... If a team reuses an existing application to build a second or third product on top of it, we often find compromises because the base application was not optimized for the new purpose. If there is no time to discuss and renew the software architecture, we see a growing erosion. The team uses hacks and ignores or bypasses architectural specifications during implementation. Furthermore, if it is not possible to manually identify all architecture violation in a software system. And finally, the understanding and knowledge of the system and project experience are not equally present everywhere in the team. This problem is exacerbated when outsourcing comes into play."

### a Which of the following management and process-related factors contribute to software erosion?

- [x] Time pressure leading to shortcuts that are never replaced.
- [x] Internal software quality not being important to project management.
- [x] No time to discuss and renew software architecture.
- [x] Unequal understanding and knowledge within the team, exacerbated by outsourcing.
- [ ] Regular code reviews and architectural discussions.

**Rationale:** These are management and organizational factors that contribute to erosion: "Time pressure leads to shortcuts that are usually never replaced by clean solutions later. The internal software quality is often not important to project management... If there is no time to discuss and renew the software architecture, we see a growing erosion... And finally, the understanding and knowledge of the system and project experience are not equally present everywhere in the team. This problem is exacerbated when outsourcing comes into play."

### b Which technical and architectural factors contribute to software erosion?

- [x] Architecture-violating dependencies arising unnoticed.
- [x] Coupling and complexity growing faster than expected.
- [x] Inability to manually identify all architecture violations.
- [x] Reusing existing applications for new purposes without optimization.
- [ ] Implementing proper separation of concerns.

**Rationale:** These are technical factors that contribute to erosion: "First of all, architecture violating dependency often arise unnoticed... The degree of coupling and complexity in the project often grow faster than expected... If a team reuses an existing application to build a second or third product on top of it, we often find compromises because the base application was not optimized for the new purpose... Furthermore, if it is not possible to manually identify all architecture violation in a software system."

### c What are the main categories of factors that lead to software erosion?

- [x] Management and process issues (time pressure, lack of architectural discussions, team knowledge gaps).
- [x] Technical and architectural challenges (unnoticed violations, growing complexity, manual detection limitations).
- [x] Project reuse and adaptation problems (using existing applications for new purposes without proper optimization).
- [ ] Regular refactoring and architectural renewal activities.

**Rationale:** The text describes three main categories of erosion factors: management/process issues (time pressure, lack of management focus on quality, insufficient architectural discussions, team knowledge disparities), technical challenges (unnoticed architecture violations, complexity growth, detection difficulties), and reuse problems (adapting existing applications without proper optimization).

### What is the cornerstone of a product quality evaluation system, according to the text?

- [ ] The number of features implemented.
- [x] The quality model specified by ISO 25010.
- [ ] The speed of development.
- [ ] The cost of the software.

**Rationale:** The text states: "The quality model specified by ISO 25010 is the cornerstone of a product quality evaluation system."

### What does "Functional Suitability" in the ISO 25010 quality model describe?

- [ ] The system's performance.
- [x] The degree to which the software covers all specific tasks and user objectives, provides correct results, and is appropriate for user needs.
- [ ] The system's ability to be maintained.
- [ ] The system's security features.

**Rationale:** The text states: "When we think about software quality, our first thought is about functional suitability. The three sub-characteristics in the quality model describe the degree to which the software covers all specific tasks and user objectives, provides the correct results and is appropriate for the user's need."

### What aspects does "Performance Efficiency" cover in the ISO 25010 quality model?

- [ ] Only the response time of the system.
- [x] Time behavior (e.g., response times), resources used by the system, and meeting maximum limits.
- [ ] The system's ability to be compatible with other systems.
- [ ] The system's ease of use.

**Rationale:** The text states: "Performance efficiency covers the time behavior, for example, response times, the resources used by the system and if maximum limits met the requirements."

### What does "Compatibility" focus on in the ISO 25010 quality model?

- [ ] The system's ability to be maintained.
- [x] How a system can perform its required functions efficiently while sharing resources and environment with other systems, and interoperability.
- [ ] The system's security features.
- [ ] The system's ease of use.

**Rationale:** The text states: "The characteristic compatibility focuses on how a system can perform its required functions efficiently while sharing resources and environment with other systems that should as well not influence by the considered system. Also, the interoperability with other systems belongs to compatibility."

### Which of the following are sub-characteristics of "Usability" in the ISO 25010 quality model?

- [x] The degree to which the user is able to recognize whether the system is appropriate for his needs.
- [x] How easy is it to learn and use the system.
- [x] How easy is it to operate and control.
- [x] Protection against making errors.
- [x] Aesthetics.
- [x] Accessibility for all target groups.
- [ ] Response time.
- [ ] Resource utilization.

**Rationale:** The text states: "Usability comprises the degree to which the user is able to recognize whether the system is appropriate for his needs, how easy is it to learn, how to use the system and how easy is it to operate and control. Additionally, the system should protect the user against making errors. Also, the aesthetics is the sub-characteristic of usability as well as the accessibility for all target groups including those having limited abilities."

### What does "Reliability" encompass in the ISO 25010 quality model?

- [ ] Only the system's ability to recover from failures.
- [x] Maturity (functioning under normal operation), availability (when required for use), fault tolerance (operating as intended even with faults), and recoverability (data/state after interruption).
- [ ] The system's security features.
- [ ] The system's ease of maintenance.

**Rationale:** The text states: "Also, our system should be reliable, meaning that it should be mature enough to function under normal operation, that it is available when required for use, should operate as intended, even in case of hardware and software faults and can recover data or state after an interruption or failure."

### Which of the following are sub-characteristics of "Reliability" in the ISO 25010 quality model?

- [x] Maturity (functioning under normal operation)
- [x] Availability (when required for use)
- [x] Fault tolerance (operating as intended even with faults)
- [x] Recoverability (data/state recovery after interruption)
- [ ] Response time
- [ ] Resource utilization
- [ ] Aesthetics

**Rationale:** The text states: "Also, our system should be reliable, meaning that it should be mature enough to function under normal operation, that it is available when required for use, should operate as intended, even in case of hardware and software faults and can recover data or state after an interruption or failure." This format allows assessment of understanding of each individual reliability sub-characteristic.

### What aspects does "Security" cover in the ISO 25010 quality model?

- [x] Confidentiality (data access by authorized users).
- [x] Integrity (preventing unauthorized access).
- [x] Non-repudiation (proof of actions/events).
- [x] Accountability (tracing actions to entities).
- [x] Authenticity (proving identity).
- [ ] Performance efficiency.
- [ ] Usability.

**Rationale:** The text states: "A system should ensure that data can only be accessed by those who have access to it and should prevent unauthorized access, named confidentially and integrity. On repudiation, describes the degree to which actions or events can be proven to have taken place so that they cannot be repudiated later. Security covers also accountability. Those actions of an entity can be traced uniquely to the entity. And finally, authenticity, the degree to which the identity of subjects or resources can be proven to be the one claimed."

### What does "Maintainability" describe in the ISO 25010 quality model?

- [ ] The system's performance.
- [x] How easy a system can be extended, changed, and tested, including modularity, reusability, analyzability, modifiability, and testability.
- [ ] The system's security features.
- [ ] The system's compatibility with other systems.

**Rationale:** The text states: "Maintainability is a characteristic, describing how easy a system can be extended, changed and tested. For software architect, this is their natural field of activity. Regard the composition of components, i.e. modularity, and how building blocks can be reused. Is a system easy to analyze, e.g. can be assessed the impact of a change? Is it possible to modify the system without introducing defects and degrading the product quality? And finally, maintainability also considers how effective and efficient the system can be tested."

### Which of the following are sub-characteristics of "Maintainability" in the ISO 25010 quality model?

- [x] Modularity (composition of components)
- [x] Reusability (how building blocks can be reused)
- [x] Analyzability (assessing the impact of changes)
- [x] Modifiability (modifying without introducing defects)
- [x] Testability (effective and efficient testing)
- [ ] Response time
- [ ] Security features
- [ ] User friendliness

**Rationale:** The text states: "Maintainability is a characteristic, describing how easy a system can be extended, changed and tested. For software architect, this is their natural field of activity. Regard the composition of components, i.e. modularity, and how building blocks can be reused. Is a system easy to analyze, e.g. can be assessed the impact of a change? Is it possible to modify the system without introducing defects and degrading the product quality? And finally, maintainability also considers how effective and efficient the system can be tested." This format allows assessment of understanding of each individual maintainability sub-characteristic.

### What does "Portability" mean in the ISO 25010 quality model?

- [ ] The system's ability to be maintained.
- [x] How good a system adapts for different or evolving hardware, software, and environments, including ease of installation and replaceability.
- [ ] The system's security features.
- [ ] The system's ease of use.

**Rationale:** The text states: "Portability means how good a system adapts for different or evolving hardware, software and environments. How easy is the installation process and if it is possible to replace a system by another system for the same purpose?"

### Can software quality be measured directly?

- [ ] Yes, it can be measured directly as a single value.
- [x] No, quality as such cannot be measured, but the degree to which the system fulfills the characteristics can be measured if requirements are quantifiable.
- [ ] Only functional suitability can be measured.
- [ ] Only non-functional requirements can be measured.

**Rationale:** The text states: "Quality as such cannot be measured. But the degree to which the system fulfills the characteristics can. To do this, the requirements must be measurable, i.e. quantified."

### What is a key insight regarding the fulfillment of different quality characteristics?

- [ ] Fulfilling one characteristic always improves all others.
- [x] A high degree of fulfillment of one characteristic can lead to only a lower degree being achieved for another (e.g., performance optimization vs. modularity).
- [ ] All characteristics can always be maximized simultaneously.
- [ ] Quality characteristics are independent of each other.

**Rationale:** The text states: "It is important to know that a high degree of fulfillment of one characteristic can lead to only a lower degree being achieved for another. For example, performance optimization can lead to compromises having to be made in terms of modularity."

### What is the primary purpose of "Utility Trees" in the context of quality characteristics?

- [ ] To replace the need for any other documentation.
- [x] To structure and summarize scenarios, and to guide the process of finding relevant scenarios.
- [ ] To automatically generate code from quality requirements.
- [ ] To define the programming language to be used.

**Rationale:** The text states: "These scenarios can easily be structured with the help of utility trees which summarize scenarios. Quality trees also offer a good opportunity to derive the scenarios based on the specific quality characteristics. They guide the process of finding relevant scenarios and they help ensure that no scenarios are overlooked."

### How are utility trees typically identified?

- [ ] Through automated analysis of the codebase.
- [x] In brainstorming workshops.
- [ ] By reviewing existing documentation.
- [ ] By interviewing individual developers.

**Rationale:** The text states: "Usually, the trees are identified in brainstorming workshops."

### What is the structure of a utility tree, from left to right?

- [ ] Concrete scenarios, specific requirements, general attributes.
- [x] General attributes/characteristics, more specific requirements, concrete scenarios.
- [ ] Specific requirements, general attributes, concrete scenarios.
- [ ] Concrete scenarios, general attributes, specific requirements.

**Rationale:** The text states: "We start with general attributes or characteristics, respectively on the left. ... We derive more specific requirements in the example latency and throughput for the characteristic performance. In the last step, we then determine the concrete scenarios for each requirement."

### What is the advice for making a scenario measurable?

- [ ] Keep it as general as possible.
- [x] Be as precise as possible, including limit values (e.g., "The system must perform functionality X under normal conditions within time epsilon").
- [ ] Focus only on qualitative descriptions.
- [ ] Avoid any numerical values.

**Rationale:** The text states: "Be as precise as possible in a scenario to make it measurable. An example for a bad scenario is the performance should be high. It is better to describe a limit value here i.e. The system must perform a functionality X under normal conditions within time epsilon."

### What are the three types of scenarios distinguished in the text?

- [ ] Functional, Non-functional, and Performance.
- [x] Use case scenarios (application/usage), Change scenarios, and Stress scenarios (borderline/boundary).
- [ ] Input, Process, and Output.
- [ ] Design, Implementation, and Testing.

**Rationale:** The text states: "We distinguish three types of scenarios. ... First, we have use case scenarios, also called application or usage scenarios. ... The second type is change scenarios. ... Main for safety critical system, we also consider the third type of scenarios, the stress scenarios, also called borderline or boundary scenarios."

### What is the structure of a scenario?

- [ ] Problem, Solution, Outcome.
- [x] Stimulus, Origin, Surrounding (state of the system), Affected part, Response, and Response metric.
- [ ] Input, Processing, Output.
- [ ] Actor, Action, Result.

**Rationale:** The text states: "Scenarios are structured as follows. We have a stimulus, meaning the cooperation of the crossing state holder with the system. We specify the origin of the course. ... The surrounding, meaning the state of the system, is as well part of the scenario. The scenario includes which part of the system is affected and also how it responds to the stimulus. Finally, we have to specify how the response can be measured."

### Why is it important to provide a "response metric" in a scenario?

- [ ] To make the scenario longer.
- [x] Because it's the only way to evaluate the system's behavior in the scenario (e.g., through testing) and make a fact-based, impartial judgment.
- [ ] To make the scenario more complex.
- [ ] To ensure that the scenario is always positive.

**Rationale:** The text states: "It is important to provide this response metric because it's the only way to evaluate the system's behavior in the scenario, e.g. through testing. A good scenario names the metric and threshold explicitly. This allows to make a fact-based impartial judgment and devoid subjective opinions."

### What is the advice regarding average times versus quantile statements when specifying response times in scenarios?

- [ ] Average times are always sufficient.
- [x] Average times are not interesting; quantile statements are preferred for precise measurement.
- [ ] Quantile statements are too complex to be useful.
- [ ] Response times should not be measured.

**Rationale:** The text states: "Average times are not interesting, but quantile statements. A quantile defines a specific part of a data set."

### What is the implication of an availability of "99%" in terms of downtime?

- [ ] It means the system is almost always available with no significant downtime.
- [x] It means around 15 minutes downtime a day and more than 3.5 days per year, which is normally not within the acceptable range.
- [ ] It means the system is available 99% of the time, with no specific downtime implications.
- [ ] It means the system is highly available.

**Rationale:** The text states: "If we calculate the availability, 99% means around 15 minutes downtime a day and more than 3.5 days per year. Normally, this is not within the acceptable range."

### What does ATAM stand for, and what is its primary focus?

- [ ] Agile Team Assessment Method; focuses on team performance.
- [x] Architectural Trade-off Analysis Method; focuses on how well the architecture meets quality requirements and trade-offs between competing objectives.
- [ ] Automated Testing and Analysis Method; focuses on automated testing.
- [ ] Architecture Technical Assessment Model; focuses on technical implementation details.

**Rationale:** The text states: "ATEM stands for Architectural Trade-of-Analysis method. ... ATEM focuses on the question how good the architecture met the quality requirements. It is particularly important to work out trade-offs between competing quality objectives."

### What is a key characteristic of the ATAM method regarding stakeholder involvement?

- [ ] Only the development team is involved.
- [x] It involves not only the development team or architects but also relevant stakeholders of the system.
- [ ] Only external experts are involved.
- [ ] Stakeholders are only informed after the evaluation is complete.

**Rationale:** The text states: "One characteristic of the method is to also involve the stakeholders of the system, not only the development team or the architects."

### What are the four phases of the ATAM workshop format?

- [ ] Planning, Design, Implementation, Testing.
- [x] Presentation, Architectural Approaches Identification, Test, and Results Presentation.
- [ ] Requirements, Analysis, Design, Deployment.
- [ ] Brainstorming, Prototyping, Evaluation, Refinement.

**Rationale:** The text describes the phases: "It defines a workshop format with four phases... In the presentation phase... Phase two starts with the identification of architectural approaches... After the first evaluation phase, another phase follows that is named test... In the last phase, the results are presented to the audience..."

### What is the role of the "evaluation team" in ATAM?

- [ ] To implement the software.
- [x] To consist of impartial external experts who introduce the method and clarify quality requirements.
- [ ] To define the business goals of the system.
- [ ] To present the high-level architecture.

**Rationale:** The text states: "The evaluation team consists of impartial external experts. ... In the presentation phase, the ATEM method is first introduced by the evaluation team. They also clarify the significance of quality requirements and answer questions about the process."

### What is the role of stakeholders in the "presentation phase" of ATAM?

- [ ] To present the high-level architecture.
- [x] To present the business goals and business drivers to the workshop participants.
- [ ] To identify architectural approaches.
- [ ] To evaluate the architecture against scenarios.

**Rationale:** The text states: "After that, the stakeholders present the business goals and business drivers to the workshop participants."

### What is the role of the architect in the "presentation phase" of ATAM?

- [ ] To define the quality requirements.
- [x] To present the high-level architecture of the system, considering the business objectives.
- [ ] To identify risks and non-risks.
- [ ] To lead the evaluation team.

**Rationale:** The text states: "The architect then presents the high-level architecture of the system, taking into account the previously mentioned business objectives."

### What happens in "Phase two" of ATAM, after the presentation phase?

- [ ] The final results are presented.
- [x] Architectural approaches are identified, and scenarios and quality trees are created.
- [ ] The system is deployed to production.
- [ ] The project budget is finalized.

**Rationale:** The text states: "Phase two starts with the identification of architectural approaches like patterns and styles presented by the architect. ... The next step is the creation of scenarios and quality trees."

### What is the purpose of the "Test" phase in ATAM?

- [ ] To perform unit tests on the code.
- [x] To create more scenarios to test whether the architecture can fulfill them, often involving additional stakeholders.
- [ ] To deploy the system to a test environment.
- [ ] To gather user feedback on the implemented system.

**Rationale:** The text states: "After the first evaluation phase, another phase follows that is named test. This is where additional stakeholders often come into play. More scenarios are created to test whether the architecture is also able to fulfill these scenarios."

### What are the key benefits gained from conducting an ATAM evaluation?

- [x] Early identification of risks.
- [x] Help in defining quality requirements.
- [x] Better documented architecture, with architectural decisions revealed.
- [x] Improved communication between stakeholders.
- [x] Higher quality of the software architecture.
- [ ] Guaranteed bug-free software.
- [ ] Elimination of all future maintenance.

**Rationale:** The text states: "Especially, ATEM supports the early identification of risks and help us to define our quality requirements. The architecture is better documented, mainly architectural decisions are no longer hidden but revealed. Also, ATEM helps to improve the communication between stakeholders as they have an important role in the process. Last but not least, ATEM ensures a higher quality of the software architecture."

### What is the primary difference between quantitative and qualitative evaluation of software architectures?

- [ ] Quantitative evaluation focuses on user feedback, while qualitative focuses on code metrics.
- [x] Quantitative evaluation involves determining numbers (metrics) from existing artifacts, while qualitative evaluation checks if functional and non-functional requirements are sufficiently met.
- [ ] Quantitative evaluation is always manual, while qualitative is automated.
- [ ] Quantitative evaluation is for functional requirements, while qualitative is for non-functional requirements.

**Rationale:** The text states: "We can measure quantitatively by determining numbers. ... On the other hand, software can evaluate it qualitatively. For example, its architecture. Qualitative means that it is checked whether the functional and non-functional requirements have been sufficiently taken into account by the software architecture."

### Which of the following are examples of metrics used in quantitative evaluation?

- [x] Number of methods per class.
- [x] Lines of code per class.
- [x] Number of dependencies between classes.
- [ ] User satisfaction scores.
- [ ] Maintainability assessment by an expert.

**Rationale:** The text states: "Examples of metrics are the number of methods or lines of code per class, or the number of dependencies between classes."

### What is a key characteristic of metrics derived from qualitative characteristics (e.g., for maintainability)?

- [ ] They are always meaningful on their own.
- [x] They are never meaningful on their own, are subject to evaluator interpretation, and are not comparable between multiple applications.
- [ ] They are always directly comparable across different projects.
- [ ] They eliminate the need for any human interpretation.

**Rationale:** The text states: "Although it is possible to make qualitative characteristics quantifiable, but such metrics are never meaningful on their own, but are always subject to the interpretation of the evaluator. Therefore, they are not comparable between multiple applications."

### What is a "measure" or "metric" in the context of quantitative evaluation?

- [ ] A subjective opinion about software quality.
- [x] A mapping that allocates a measured value to an object to characterize a certain attribute.
- [ ] A tool for automated code generation.
- [ ] A method for qualitative assessment.

**Rationale:** The text states: "A measure or metric is a mapping. It allocates a measured value to an object to characterize a certain attribute."

### What are two problems encountered when trying to make a metric meaningful, using lines of code as an example?

- [ ] It is too difficult to count lines of code.
- [x] Different and imprecise definitions (e.g., including blank lines) and influence by surrounding variables (e.g., programming styles).
- [ ] Metrics are always too high or too low.
- [ ] Metrics cannot be collected automatically.

**Rationale:** The text states: "First, we often find different definitions, and they are mostly imprecise. In case of lines of code, do we include blank lines? And it is possible to reduce lines by writing particularly long lines. Second, the measured values are influenced by surrounding variables. Therefore, we cannot simply transfer metrics if the environment is different."

### What is the role of "prototyping" in the architectural design process?

- [ ] To replace the need for any design.
- [x] To evaluate different implementation strategies, experiment with solutions, and provide early, fast feedback to reduce risk.
- [ ] To generate the final production code.
- [ ] To only confirm existing design decisions.

**Rationale:** The text states: "Prototypes enable us to evaluate different implementation strategies. Thus, we can experiment and try out possible solutions. They give early and fast feedback on our architectural decisions and thus reduce risk."

### What is the difference between a "prototype" and a "technical cut"?

- [ ] Prototypes are always discarded, while technical cuts are always reused.
- [x] Prototypes already contain domain implementation, while technical cuts concentrate on pure technology.
- [ ] Prototypes are only for functional requirements, while technical cuts are for non-functional.
- [ ] There is no difference; the terms are interchangeable.

**Rationale:** The text states: "Prototypes differ from technical cuts because they already contain domain implementation. Technical cuts, on the other hand, concentrate on pure technology."

### What is the general advice regarding reusing a prototype or parts of it for a real product?

- [ ] It is always recommended to reuse prototypes to save time.
- [x] Prototypes should generally be disposed of (throwaway prototypes) because they often contain code that does not meet production quality requirements.
- [ ] Only the core of a prototype (pilot) can be reused.
- [ ] Prototypes should be refactored into production code.

**Rationale:** The text states: "Note that you should not reuse a prototype or parts of it for a real product to implement. Prototypes often contain a lot of code that is only programmed down quickly and usually does not met the quality requirements of productive code. EG tests are often missing. So the prototype should be disposed. It is a so-called throwaway prototype."

### What does a high value for "average component dependency" indicate, and why?

- [ ] It indicates a well-structured software architecture.
- [x] It indicates a bad software architecture because cycles worsen the measured value, leading to increased coupling and complexity.
- [ ] It indicates that the system is highly modular.
- [ ] It indicates that the system is easy to maintain.

**Rationale:** The text states: "As cycles worsens the measured value, a high value for average component dependency is an indication for a bad software architecture. But you have to look at it in context."
