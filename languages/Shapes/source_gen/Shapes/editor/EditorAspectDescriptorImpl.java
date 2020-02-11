package Shapes.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Canvas_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Circle_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Color_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ColorReference_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Square_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        if (true) {
          if ("Shapes.editor.ShapeColor".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new ShapeColor());
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }

  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex2.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new ColorReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffdf26dL), MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffdf251L), MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffe8c8cL), MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffebd05L), MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffdf263L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffdf250L)).seal();
  private static final ConceptSwitchIndex conceptIndex2 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb2221ba7a9454821L, 0xa8a492feb564c230L, 0x88c4fd1cffebd05L)).seal();
}
