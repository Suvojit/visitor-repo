import {Component, OnInit} from '@angular/core';
import {Form, FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/internal/Observable';
import {Visitor} from '../../models/visitor';
import {VisitorService} from '../../service/visitor.service';
import {timer} from 'rxjs/internal/observable/timer';
import {shareReplay, switchMap} from 'rxjs/operators';

@Component({
  selector: 'app-visitor-form',
  templateUrl: './visitor-form.component.html',
  styleUrls: ['./visitor-form.component.scss']
})
export class VisitorFormComponent implements OnInit {

  public visitorForm: FormGroup;

  public visitors$: Observable<Visitor[]>;


  displayedColumns: string[] = ['firstName', 'lastName'];

  constructor(private formBuilder: FormBuilder,
              private visitorService: VisitorService) {
  }

  ngOnInit(): void {
    this.visitorForm = this.formBuilder.group({
      firstName: [''],
      lastName: ['']
    });
    this.getAll();
  }

  getAll(): void {
    this.visitors$ = timer(0, 15000)
      .pipe(
        switchMap(() => this.visitorService.getVisitors()),
        shareReplay(1)
      );
  }

  submit(): void {
    let value = this.visitorForm.value;
    this.visitorService.create(value).subscribe(console.log);
    this.visitorForm.reset();
  }
}
