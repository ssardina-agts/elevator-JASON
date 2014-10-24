This project aims to develop a basic Agent framework in Jason for controlling elevator systems. The simulations and their benchmark results are handled by an open source elevator simulator <http://elevatorsim.sourceforge.net/>. 

The project focuses on 3 goals:

1. Building an agent framework in Jason that control an elevator system (i.e. controlling cars) by processing events (percept) then react accordingly.
2. Develop basic algorithms in this agent framework to demonstrate its operation.
3. Extend the elevator simulator so that it can communicate with our agent framework for decision making during simulation scenarios.

MAIN FEATURES OF THE JASON IMPLEMENTATION:

1. RMI Interface: to connect and handle communication between the system’s two components in an object-oriented manner.
2. Jason Environment: acts a “bridge” between the Jason agents and the elevator simulator by forwarding events and decisions between the two.
3. JController: the extension to the original elevator simulator that communicate with the Jason part.
4. Coordinator agent: one agent responsible for creating car driver agents, which then in turn handle movement of the cars.
5. Simple car driver: a dump car driver that implements algorithm of SimpleController.
6. Meta car driver: a car driver that implements algorithm of MetaController.