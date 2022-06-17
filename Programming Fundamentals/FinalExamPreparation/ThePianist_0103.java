package FinalExamPreparation;

import java.util.*;

public class ThePianist_0103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> piecesMap = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] piecesParts = scanner.nextLine().split("\\|");
            String pieceName = piecesParts[0];
            String composer = piecesParts[1];
            String key = piecesParts[2];
            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            piecesMap.put(pieceName, pieceInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandData = command.split("\\|");
            String commandName = commandData[0];
            switch (commandName) {
                case "Add":
                    String pieceToAdd = commandData[1];
                    String composerToAdd = commandData[2];
                    String keyToAdd = commandData[3];
                    if (piecesMap.containsKey(pieceToAdd)) {
                        System.out.printf("%s is already in the collection!%n", pieceToAdd);
                    } else {
                        List<String> listToAdd = new ArrayList<>();
                        listToAdd.add(composerToAdd);
                        listToAdd.add(keyToAdd);
                        piecesMap.put(pieceToAdd, listToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n",
                                pieceToAdd, composerToAdd, keyToAdd);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = commandData[1];
                    if (piecesMap.containsKey(pieceToRemove)) {
                        piecesMap.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!%n", pieceToRemove);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                    }

                    break;
                case "ChangeKey":
                    String pieceName = commandData[1];
                    String keyToChange = commandData[2];
                    if (piecesMap.containsKey(pieceName)) {
                        List<String> currentPieceInf = piecesMap.get(pieceName);
                        currentPieceInf.remove(1);
                        currentPieceInf.add(keyToChange);
                        piecesMap.put(pieceName, currentPieceInf);

                        System.out.printf("Changed the key of %s to %s!%n", pieceName, keyToChange);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        piecesMap.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (e1.getKey().compareTo(e2.getKey()) == 0){
                        return e1.getValue().get(0).compareTo(e2.getValue().get(0));
                    }
                    return e1.getKey().compareTo(e2.getKey());
                })
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n"
                , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
